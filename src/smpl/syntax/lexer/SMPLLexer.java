/* The following code was generated by JFlex 1.6.1 */

package smpl.syntax.lexer;

/* Specification for SMPL tokens */

// user customisations
import java_cup.runtime.*;

import smpl.exceptions.TokenException;

import smpl.syntax.parser.sym;

// Jlex directives
    

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/smpl/syntax/lexer/SMPLLexer.jflex</tt>
 */
public class SMPLLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;
  private static final String ZZ_NL = System.getProperty("line.separator");

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\2\1\2\1\1\1\0\1\2\1\1\22\0\1\2\1\0"+
    "\1\27\1\5\1\0\1\17\2\0\1\22\1\23\1\15\1\13\1\0"+
    "\1\14\1\12\1\16\12\4\3\0\1\21\3\0\32\11\1\0\1\25"+
    "\1\0\1\20\1\3\1\0\2\11\1\10\2\11\1\7\7\11\1\26"+
    "\5\11\1\6\1\24\5\11\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff95\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\2\1\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\2\0"+
    "\1\23\1\26\1\27\1\30\1\31\1\32\1\0\1\33"+
    "\1\34\2\0\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[39];
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
    "\0\0\0\30\0\60\0\60\0\60\0\110\0\140\0\170"+
    "\0\220\0\60\0\60\0\60\0\60\0\60\0\60\0\60"+
    "\0\60\0\60\0\60\0\250\0\300\0\60\0\330\0\60"+
    "\0\60\0\360\0\u0108\0\60\0\60\0\60\0\60\0\60"+
    "\0\u0120\0\u0138\0\60\0\60\0\u0150\0\u0168\0\60";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[39];
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
    "\1\3\1\4\1\5\1\6\1\7\1\10\4\6\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\6\1\3\1\6\1\23\1\24\1\0\23\24"+
    "\1\25\1\24\1\26\33\0\2\6\1\0\4\6\12\0"+
    "\1\6\1\0\1\6\5\0\1\7\5\0\1\27\23\0"+
    "\1\30\1\31\1\32\13\0\1\33\7\0\1\34\23\0"+
    "\1\24\1\0\23\24\1\0\1\24\7\0\1\35\17\0"+
    "\1\36\1\37\4\0\1\27\26\0\1\40\2\0\4\40"+
    "\12\0\1\40\1\41\1\40\5\0\1\42\1\0\4\42"+
    "\12\0\1\42\1\0\1\42\7\0\1\43\17\0\1\44"+
    "\5\0\1\45\1\0\4\45\12\0\1\45\1\0\1\45"+
    "\5\0\1\46\1\0\4\46\12\0\1\46\1\0\1\46"+
    "\5\0\1\47\1\0\4\47\12\0\1\47\1\0\1\47"+
    "\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[384];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\3\11\4\1\12\11\2\1\1\11\1\1\2\11"+
    "\2\0\5\11\1\1\1\0\2\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[39];
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
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    StringBuffer string = new StringBuffer();

	public int getChar() {
	return yychar + 1;
    }

    public int getColumn() {
    	return yycolumn + 1;
    }

    public int getLine() {
	return yyline + 1;
    }

    public String getText() {
	return yytext();
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public SMPLLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 122) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  private static String zzToPrintable(String str) {
    StringBuilder builder = new StringBuilder();
    for (int n = 0 ; n < str.length() ; ) {
      int ch = str.codePointAt(n);
      int charCount = Character.charCount(ch);
      n += charCount;
      if (ch > 31 && ch < 127) {
        builder.append((char)ch);
      } else if (charCount == 1) {
        builder.append(String.format("\\u%04X", ch));
      } else {
        builder.append(String.format("\\U%06X", ch));
      }
    }
    return builder.toString();
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, TokenException {
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

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
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
          yycolumn += zzCharCount;
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
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          { 	return new Symbol(sym.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [169] { // error situation"+ZZ_NL+"\t       String msg = String.format(\"Unrecognised Token: %s\", yytext());"+ZZ_NL+"\t       throw new TokenException(msg); }");
            { // error situation
	       String msg = String.format("Unrecognised Token: %s", yytext());
	       throw new TokenException(msg);
            }
          case 30: break;
          case 2: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [81] { //skip newline, but reset char counter"+ZZ_NL+"\t\t\t yychar = 0; }");
            { //skip newline, but reset char counter
			 yychar = 0;
            }
          case 31: break;
          case 3: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [84] { // skip whitespace }");
            { // skip whitespace
            }
          case 32: break;
          case 4: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [112] { // VAR"+ZZ_NL+"\t       return new Symbol(sym.VAR, yytext()); }");
            { // VAR
	       return new Symbol(sym.VAR, yytext());
            }
          case 33: break;
          case 5: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [99] { // INTEGER"+ZZ_NL+"\t       return new Symbol(sym.INT, "+ZZ_NL+"\t\t\t\t new Integer(yytext())); }");
            { // INTEGER
	       return new Symbol(sym.INT, 
				 new Integer(yytext()));
            }
          case 34: break;
          case 6: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [87] { return new Symbol(sym.PLUS); }");
            { return new Symbol(sym.PLUS);
            }
          case 35: break;
          case 7: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [88] { return new Symbol(sym.MINUS); }");
            { return new Symbol(sym.MINUS);
            }
          case 36: break;
          case 8: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [89] { return new Symbol(sym.MUL); }");
            { return new Symbol(sym.MUL);
            }
          case 37: break;
          case 9: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [90] { return new Symbol(sym.DIV); }");
            { return new Symbol(sym.DIV);
            }
          case 38: break;
          case 10: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [91] { return new Symbol(sym.MOD); }");
            { return new Symbol(sym.MOD);
            }
          case 39: break;
          case 11: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [92] { return new Symbol(sym.POWER); }");
            { return new Symbol(sym.POWER);
            }
          case 40: break;
          case 12: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [94] { return new Symbol(sym.ASSIGN); }");
            { return new Symbol(sym.ASSIGN);
            }
          case 41: break;
          case 13: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [95] { return new Symbol(sym.LPAREN); }");
            { return new Symbol(sym.LPAREN);
            }
          case 42: break;
          case 14: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [96] { return new Symbol(sym.RPAREN); }");
            { return new Symbol(sym.RPAREN);
            }
          case 43: break;
          case 15: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [146] { string.setLength(0); yybegin(STRING); }");
            { string.setLength(0); yybegin(STRING);
            }
          case 44: break;
          case 16: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [154] { string.append( yytext() ); }");
            { string.append( yytext() );
            }
          case 45: break;
          case 17: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [162] { string.append(\'\\\\\'); }");
            { string.append('\\');
            }
          case 46: break;
          case 18: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [150] { yybegin(YYINITIAL);"+ZZ_NL+"\t\t\t\t\t\treturn new Symbol(sym.STRING, string.toString()); }");
            { yybegin(YYINITIAL);
						return new Symbol(sym.STRING, string.toString());
            }
          case 47: break;
          case 19: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [105] { // REAL"+ZZ_NL+"\t\t\treturn new Symbol(sym.REAL,"+ZZ_NL+"\t\t\t\t new Double(yytext())); }");
            { // REAL
			return new Symbol(sym.REAL,
				 new Double(yytext()));
            }
          case 48: break;
          case 20: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [166] { return new Symbol(sym.TRUE, new Boolean(true)); }");
            { return new Symbol(sym.TRUE, new Boolean(true));
            }
          case 49: break;
          case 21: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [167] { return new Symbol(sym.FALSE, new Boolean(false)); }");
            { return new Symbol(sym.FALSE, new Boolean(false));
            }
          case 50: break;
          case 22: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [156] { string.append(\'\\t\'); }");
            { string.append('\t');
            }
          case 51: break;
          case 23: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [158] { string.append(\'\\n\'); }");
            { string.append('\n');
            }
          case 52: break;
          case 24: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [160] { string.append(\'\\\"\'); }");
            { string.append('\"');
            }
          case 53: break;
          case 25: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [118] { // ChARACTER"+ZZ_NL+"\t\t\treturn new Symbol(sym.CHAR, yycharat(2)); }");
            { // ChARACTER
			return new Symbol(sym.CHAR, yycharat(2));
            }
          case 54: break;
          case 26: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [141] { //SPECIAL CHARACTERS"+ZZ_NL+"\t\t\treturn new Symbol(sym.CHAR, \'\\\\\'); }");
            { //SPECIAL CHARACTERS
			return new Symbol(sym.CHAR, '\\');
            }
          case 55: break;
          case 27: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [135] { //SPECIAL CHARACTERS"+ZZ_NL+"\t\t\treturn new Symbol(sym.CHAR, \'\\t\'); }");
            { //SPECIAL CHARACTERS
			return new Symbol(sym.CHAR, '\t');
            }
          case 56: break;
          case 28: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [129] { //SPECIAL CHARACTERS"+ZZ_NL+"\t\t\treturn new Symbol(sym.CHAR, \'\\n\'); }");
            { //SPECIAL CHARACTERS
			return new Symbol(sym.CHAR, '\n');
            }
          case 57: break;
          case 29: 
            System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [123] { //Unicode"+ZZ_NL+"\t\t\treturn new Symbol(sym.CHAR, (char) Integer.parseInt(yytext().substring(2))); }");
            { //Unicode
			return new Symbol(sym.CHAR, (char) Integer.parseInt(yytext().substring(2)));
            }
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java SMPLLexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        SMPLLexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new SMPLLexer(reader);
          do {
            System.out.println(scanner.next_token());
          } while (!scanner.zzAtEOF);

        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
