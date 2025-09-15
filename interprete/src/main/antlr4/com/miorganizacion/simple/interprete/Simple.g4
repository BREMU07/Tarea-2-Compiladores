grammar Simple;

@parser::header{
	
}

@parser::members{
	
}

program: PROGRAM ID BRACKET_OPEN 
	{
		List<ASTNode> body = new ArrayList <ASTNode>();
	}
	
	(sentence{body.add($sentence.node);})*
	BRACKET_CLOSE;
	{
		for(ASTNode n : body) {
			n.execute();
		}
	}
	
sentence returns [ASTNode node]: println {$node = $println.node;}| conditional {$node = $conditional.node;};


println returns [ASTNode node]: PRINTLN expression SEMICOLON
	{$node = new Println($expression.node)};

expression returns [ASTNode node]:
	t1=factor {$node = $t1.node;}
		(PLUS t2=factor {$node = new Addition($node, $t2.node);})*;
		
conditional returns [ASTNode node]: IF PAR_OPEN expression PAR_CLOSE
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
			 	$node = new If($expression.node, body, elseBody);
			 	
			 }
			 ;

factor returns [ASTNode node]: 
		t1=term {$node = $t2.node;}
				(MULT t2=term {$node = new Multiplication($node, $t2.node);})*;

term returns [ASTNode node]: 
	NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));} 
	| BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));}
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