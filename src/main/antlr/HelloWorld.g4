grammar HelloWorld;
greetings: greeting+;
greeting: 'Hello' ID;
ID: [a-zA-Z$_]+;
WHITE_SPACE: [ \t\r\n\u000C]+ -> skip;