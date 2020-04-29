     
%%
   
%package compiler
%class Lexer
%public
%line
%column
%cup

%%

[ \t\n\r]		{ }
^#.*			{ }

Model						{ return getSymbolFactory().newSymbol ("T_MODEL", Sym.T_MODEL); }
ComplexComponent			{ return getSymbolFactory().newSymbol ("COMPLEXCOMPONENT", Sym.COMPLEXCOMPONENT); }
Component					{ return getSymbolFactory().newSymbol ("COMPONENT", Sym.COMPONENT); }
contains					{ return getSymbolFactory().newSymbol ("CONTAINS", Sym.CONTAINS); }

Interface					{ return getSymbolFactory().newSymbol ("INTERFACE", Sym.INTERFACE); }
use							{ return getSymbolFactory().newSymbol ("USE", Sym.USE); }
realize						{ return getSymbolFactory().newSymbol ("REALIZE", Sym.REALIZE); }

port						{ return getSymbolFactory().newSymbol ("O_PORT", Sym.O_PORT); }
UseInterface				{ return getSymbolFactory().newSymbol ("USE_INTERFACE", Sym.USE_INTERFACE); }
RealizeInterface			{ return getSymbolFactory().newSymbol ("REALIZE_INTERFACE", Sym.REALIZE_INTERFACE); }

"{"				{ return getSymbolFactory().newSymbol ("OPEN_CURLY", Sym.OPEN_CURLY); }
"}"				{ return getSymbolFactory().newSymbol ("CLOSE_CURLY", Sym.CLOSE_CURLY); }
"["				{ return getSymbolFactory().newSymbol ("OPEN_BRACKET", Sym.OPEN_BRACKET); }
"]"				{ return getSymbolFactory().newSymbol ("CLOSE_BRACKET", Sym.CLOSE_BRACKET); }


","				{ return getSymbolFactory().newSymbol ("COMA", Sym.COMA); }

//[0-9]+			{ return getSymbolFactory().newSymbol ("NUMBER", Sym.NUMBER, Double.valueOf(yytext())); }

[a-zA-Z][a-zA-Z_0-9]*	{ return getSymbolFactory().newSymbol ("NAME", Sym.NAME, yytext()); }

[^]				{ throw new Error("Illegal character <"+yytext()+">"); }
