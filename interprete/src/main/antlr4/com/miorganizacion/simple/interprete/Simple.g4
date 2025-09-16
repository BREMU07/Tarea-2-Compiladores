grammar Simple;

@parser::header{
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.miorganizacion.simple.interprete.ast.*;
}

@parser::members{
	Map<String, Object> symbolTable = new HashMap<String, Object>();
}

program: PROGRAM ID BRACKET_OPEN 
	{
		List<ASTNode> body = new ArrayList <ASTNode>();
		Map<String, Object> symbolTable = new HashMap<String, Object>();
	}
	
	(sentence{body.add($sentence.node);})*
	BRACKET_CLOSE
	{
		for(ASTNode n : body) {
			n.execute(symbolTable);
		}
	};
	
sentence returns [ASTNode node]: println {$node = $println.node;}
	| conditional {$node = $conditional.node;}
	| var_decl { $node = $var_decl.node;}
	| var_assign {$node = $var_assign.node;};


var_decl returns [ASTNode node]: 
	VAR ID SEMICOLON { $node = new VarDecl($ID.text);};

var_assign returns [ASTNode node]: 
	ID ASSIGN logic_ope SEMICOLON {$node = new VarAssign($ID.text, $logic_ope.node);};
println returns [ASTNode node]: PRINTLN logic_ope SEMICOLON
	{$node = new Println($logic_ope.node);};


conditional returns [ASTNode node]: IF PAR_OPEN logic_ope PAR_CLOSE
			 {
			 	List<ASTNode> body = new ArrayList <ASTNode>();
			 }
			 BRACKET_OPEN (s1=sentence{ body.add($s1.node);})* BRACKET_CLOSE
			 ELSE
			 {
			 	List<ASTNode> elseBody = new ArrayList <ASTNode>();
			 }
			 BRACKET_OPEN (s2=sentence{ elseBody.add($s2.node);})* BRACKET_CLOSE
			 {
			 	$node = new If($logic_ope.node, body, elseBody);

			 }
			 ;

logic_ope returns [ASTNode node]:
	t1=expression {$node = $t1.node;}
		(EQ e2=expression {$node = new Equal($node, $e2.node);})*;


expression returns [ASTNode node]:
	t1=factor {$node = $t1.node;}
		(PLUS t2=factor {$node = new Addition($node, $t2.node);})*;


factor returns [ASTNode node]: 
		p1=power {$node = $p1.node;}
				(MULT p2=power {$node = new Multiplication($node, $p2.node);})*;

power returns [ASTNode node]:
		t1=term {$node = $t1.node;}
				(POWER t2=term {$node = new Power($node, $t2.node);})*;

term returns [ASTNode node]: 
	NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));} 
	| BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));}
	| ID {$node = new VarRef($ID.text);}
	| RAND_FLIP NUMBER {$node = new RandFlip(Double.parseDouble($NUMBER.text)); }
	| PAR_OPEN expression {$node = $expression.node;} PAR_CLOSE;

PROGRAM:  'program';
VAR: 'var';
PRINTLN: 'println';
IF: 'if';
ELSE: 'else';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

RAND_FLIP: '?';

POWER: '^';

AND: '&&';
OR: '||';
NOT: '!';



GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

ASSIGN: '=';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

SEMICOLON: ';';

BOOLEAN: 'true' | 'false';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

NUMBER: [0-9]+;

WS: [ \t\n\r]+ -> skip;