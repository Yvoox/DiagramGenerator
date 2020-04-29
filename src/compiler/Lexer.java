/* The following code was generated by JFlex 1.4.1a on 17/04/18 17:26 */

package compiler;

import java_cup.runtime.SymbolFactory;
     

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1a
 * on 17/04/18 17:26 from the specification file
 * <tt>compiler/Lexer.java</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  2,  0,  0,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1,  0,  0,  3,  0,  0,  0,  0,  0,  0,  0,  0, 30,  0,  0,  0, 
    32, 32, 32, 32, 32, 32, 32, 32, 32, 32,  0,  0,  0,  0,  0,  0, 
     0, 31, 31,  9, 31, 31, 31, 31, 31, 19, 31, 31, 31,  4, 31, 31, 
    31, 31, 25, 31, 31, 24, 31, 31, 31, 31, 31, 28,  0, 29,  0, 32, 
     0, 16, 31, 15,  6,  7, 21, 31, 31, 17, 31, 31,  8, 10, 13,  5, 
    11, 31, 20, 18, 14, 22, 31, 31, 12, 31, 23, 26,  0, 27,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\12\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\2\17\3\1\11\4\3\1\12\5\3\1\13"+
    "\22\3\1\14\4\3\1\15\3\3\1\16\1\3\1\17"+
    "\11\3\1\20\7\3\1\21\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[96];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\41\0\102\0\102\0\143\0\204\0\245\0\306"+
    "\0\347\0\u0108\0\u0129\0\u014a\0\u016b\0\u018c\0\102\0\102"+
    "\0\102\0\102\0\102\0\u01ad\0\u01ce\0\u01ef\0\u0210\0\u0231"+
    "\0\u0252\0\u0273\0\u0294\0\u02b5\0\u02d6\0\u02f7\0\u0318\0\u0339"+
    "\0\u035a\0\u037b\0\u039c\0\204\0\u03bd\0\u03de\0\u03ff\0\u0420"+
    "\0\204\0\u0441\0\u0462\0\u0483\0\u04a4\0\u04c5\0\204\0\u04e6"+
    "\0\u0507\0\u0528\0\u0549\0\u056a\0\u058b\0\u05ac\0\u05cd\0\u05ee"+
    "\0\u060f\0\u0630\0\u0651\0\u0672\0\u0693\0\u06b4\0\u06d5\0\u06f6"+
    "\0\u0717\0\204\0\u0738\0\u0759\0\u077a\0\u079b\0\204\0\u07bc"+
    "\0\u07dd\0\u07fe\0\204\0\u081f\0\204\0\u0840\0\u0861\0\u0882"+
    "\0\u08a3\0\u08c4\0\u08e5\0\u0906\0\u0927\0\u0948\0\204\0\u0969"+
    "\0\u098a\0\u09ab\0\u09cc\0\u09ed\0\u0a0e\0\u0a2f\0\204\0\204";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[96];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\3\1\5\4\6\1\7\1\6\1\10"+
    "\3\6\1\11\3\6\1\12\1\13\1\6\1\14\1\6"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\6"+
    "\2\3\2\4\1\24\1\5\4\6\1\7\1\6\1\10"+
    "\3\6\1\11\3\6\1\12\1\13\1\6\1\14\1\6"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\6"+
    "\1\3\45\0\1\6\1\25\24\6\5\0\2\6\4\0"+
    "\26\6\5\0\2\6\4\0\1\6\1\26\24\6\5\0"+
    "\2\6\4\0\1\6\1\27\24\6\5\0\2\6\4\0"+
    "\1\6\1\30\24\6\5\0\2\6\4\0\11\6\1\31"+
    "\14\6\5\0\2\6\4\0\3\6\1\32\22\6\5\0"+
    "\2\6\4\0\16\6\1\33\7\6\5\0\2\6\4\0"+
    "\16\6\1\34\7\6\5\0\2\6\4\0\3\6\1\35"+
    "\22\6\5\0\2\6\2\24\1\0\36\24\4\0\2\6"+
    "\1\36\23\6\5\0\2\6\4\0\6\6\1\37\17\6"+
    "\5\0\2\6\4\0\20\6\1\40\5\6\5\0\2\6"+
    "\4\0\11\6\1\41\14\6\5\0\2\6\4\0\12\6"+
    "\1\42\13\6\5\0\2\6\4\0\14\6\1\43\11\6"+
    "\5\0\2\6\4\0\3\6\1\44\22\6\5\0\2\6"+
    "\4\0\3\6\1\45\22\6\5\0\2\6\4\0\14\6"+
    "\1\46\11\6\5\0\2\6\4\0\3\6\1\47\22\6"+
    "\5\0\2\6\4\0\7\6\1\50\16\6\5\0\2\6"+
    "\4\0\12\6\1\51\13\6\5\0\2\6\4\0\12\6"+
    "\1\52\13\6\5\0\2\6\4\0\3\6\1\53\22\6"+
    "\5\0\2\6\4\0\4\6\1\54\21\6\5\0\2\6"+
    "\4\0\17\6\1\55\6\6\5\0\2\6\4\0\4\6"+
    "\1\56\21\6\5\0\2\6\4\0\4\6\1\57\21\6"+
    "\5\0\2\6\4\0\1\6\1\60\2\6\1\61\21\6"+
    "\5\0\2\6\4\0\14\6\1\62\11\6\5\0\2\6"+
    "\4\0\20\6\1\63\5\6\5\0\2\6\4\0\15\6"+
    "\1\64\10\6\5\0\2\6\4\0\11\6\1\65\14\6"+
    "\5\0\2\6\4\0\15\6\1\66\10\6\5\0\2\6"+
    "\4\0\11\6\1\67\14\6\5\0\2\6\4\0\3\6"+
    "\1\70\22\6\5\0\2\6\4\0\15\6\1\71\10\6"+
    "\5\0\2\6\4\0\21\6\1\72\4\6\5\0\2\6"+
    "\4\0\23\6\1\73\2\6\5\0\2\6\4\0\12\6"+
    "\1\74\13\6\5\0\2\6\4\0\23\6\1\75\2\6"+
    "\5\0\2\6\4\0\3\6\1\76\22\6\5\0\2\6"+
    "\4\0\10\6\1\77\15\6\5\0\2\6\4\0\11\6"+
    "\1\100\14\6\5\0\2\6\4\0\14\6\1\101\11\6"+
    "\5\0\2\6\4\0\3\6\1\102\22\6\5\0\2\6"+
    "\4\0\3\6\1\103\22\6\5\0\2\6\4\0\3\6"+
    "\1\104\22\6\5\0\2\6\4\0\11\6\1\105\14\6"+
    "\5\0\2\6\4\0\5\6\1\106\20\6\5\0\2\6"+
    "\4\0\16\6\1\107\7\6\5\0\2\6\4\0\13\6"+
    "\1\110\12\6\5\0\2\6\4\0\20\6\1\111\5\6"+
    "\5\0\2\6\4\0\17\6\1\112\6\6\5\0\2\6"+
    "\4\0\12\6\1\113\13\6\5\0\2\6\4\0\1\6"+
    "\1\114\24\6\5\0\2\6\4\0\3\6\1\115\22\6"+
    "\5\0\2\6\4\0\21\6\1\116\4\6\5\0\2\6"+
    "\4\0\11\6\1\117\14\6\5\0\2\6\4\0\6\6"+
    "\1\120\17\6\5\0\2\6\4\0\14\6\1\121\11\6"+
    "\5\0\2\6\4\0\12\6\1\122\13\6\5\0\2\6"+
    "\4\0\7\6\1\123\16\6\5\0\2\6\4\0\13\6"+
    "\1\124\12\6\5\0\2\6\4\0\3\6\1\125\22\6"+
    "\5\0\2\6\4\0\1\6\1\126\24\6\5\0\2\6"+
    "\4\0\3\6\1\127\22\6\5\0\2\6\4\0\20\6"+
    "\1\130\5\6\5\0\2\6\4\0\11\6\1\131\14\6"+
    "\5\0\2\6\4\0\21\6\1\132\4\6\5\0\2\6"+
    "\4\0\3\6\1\133\22\6\5\0\2\6\4\0\14\6"+
    "\1\134\11\6\5\0\2\6\4\0\11\6\1\135\14\6"+
    "\5\0\2\6\4\0\13\6\1\136\12\6\5\0\2\6"+
    "\4\0\12\6\1\137\13\6\5\0\2\6\4\0\3\6"+
    "\1\140\22\6\5\0\2\6";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2640];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\12\1\5\11\115\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[96];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }
private SymbolFactory symbolFactory;
public SymbolFactory getSymbolFactory() {
	return symbolFactory;
}
public void setSymbolFactory(SymbolFactory symbolFactory) {
	this.symbolFactory = symbolFactory;
}


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL[zzMarkedPosL-1]) {
        case '\n':
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL[zzMarkedPosL] != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 12: 
          { return getSymbolFactory().newSymbol ("REALIZE", Sym.REALIZE);
          }
        case 19: break;
        case 14: 
          { return getSymbolFactory().newSymbol ("COMPONENT", Sym.COMPONENT);
          }
        case 20: break;
        case 3: 
          { return getSymbolFactory().newSymbol ("NAME", Sym.NAME, yytext());
          }
        case 21: break;
        case 4: 
          { return getSymbolFactory().newSymbol ("OPEN_CURLY", Sym.OPEN_CURLY);
          }
        case 22: break;
        case 15: 
          { return getSymbolFactory().newSymbol ("INTERFACE", Sym.INTERFACE);
          }
        case 23: break;
        case 10: 
          { return getSymbolFactory().newSymbol ("O_PORT", Sym.O_PORT);
          }
        case 24: break;
        case 5: 
          { return getSymbolFactory().newSymbol ("CLOSE_CURLY", Sym.CLOSE_CURLY);
          }
        case 25: break;
        case 18: 
          { return getSymbolFactory().newSymbol ("REALIZE_INTERFACE", Sym.REALIZE_INTERFACE);
          }
        case 26: break;
        case 13: 
          { return getSymbolFactory().newSymbol ("CONTAINS", Sym.CONTAINS);
          }
        case 27: break;
        case 6: 
          { return getSymbolFactory().newSymbol ("OPEN_BRACKET", Sym.OPEN_BRACKET);
          }
        case 28: break;
        case 7: 
          { return getSymbolFactory().newSymbol ("CLOSE_BRACKET", Sym.CLOSE_BRACKET);
          }
        case 29: break;
        case 8: 
          { return getSymbolFactory().newSymbol ("COMA", Sym.COMA);
          }
        case 30: break;
        case 16: 
          { return getSymbolFactory().newSymbol ("USE_INTERFACE", Sym.USE_INTERFACE);
          }
        case 31: break;
        case 11: 
          { return getSymbolFactory().newSymbol ("T_MODEL", Sym.T_MODEL);
          }
        case 32: break;
        case 9: 
          { return getSymbolFactory().newSymbol ("USE", Sym.USE);
          }
        case 33: break;
        case 17: 
          { return getSymbolFactory().newSymbol ("COMPLEXCOMPONENT", Sym.COMPLEXCOMPONENT);
          }
        case 34: break;
        case 1: 
          { throw new Error("Illegal character <"+yytext()+">");
          }
        case 35: break;
        case 2: 
          { 
          }
        case 36: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(Sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
