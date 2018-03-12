/* Generated By:JavaCC: Do not edit this line. MooplParser.java */
  import syntaxtree.*;
  import syntaxtree.interp.*;
  import java.util.List;
  import java.util.LinkedList;
  public class MooplParser implements MooplParserConstants {

  final public void testTokens() throws ParseException {
  Token t;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PROC:
      case FUN:
      case CLASS:
      case EXTENDS:
      case RETURN:
      case ARRAYOF:
      case BOOLEAN:
      case INT:
      case IF:
      case THEN:
      case ELSE:
      case WHILE:
      case DO:
      case OUTPUT:
      case LENGTH:
      case TRUE:
      case FALSE:
      case SELF:
      case NEW:
      case OBJECT:
      case ISNULL:
      case OPENCBR:
      case CLOSECBR:
      case OPENB:
      case CLOSEB:
      case COMMA:
      case OPENSBR:
      case CLOSESBR:
      case EXPMARK:
      case FSTOP:
      case SEMI:
      case INTEGER_LITERAL:
      case OP:
      case ID:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PROC:
      case FUN:
      case CLASS:
      case EXTENDS:
      case RETURN:
      case ARRAYOF:
      case BOOLEAN:
      case INT:
      case IF:
      case THEN:
      case ELSE:
      case WHILE:
      case DO:
      case OUTPUT:
      case LENGTH:
      case TRUE:
      case FALSE:
      case SELF:
      case NEW:
      case OBJECT:
      case ISNULL:
      case OPENCBR:
      case CLOSECBR:
      case OPENB:
      case CLOSEB:
      case COMMA:
      case OPENSBR:
      case CLOSESBR:
      case EXPMARK:
      case FSTOP:
      case SEMI:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PROC:
          t = jj_consume_token(PROC);
          break;
        case FUN:
          t = jj_consume_token(FUN);
          break;
        case CLASS:
          t = jj_consume_token(CLASS);
          break;
        case RETURN:
          t = jj_consume_token(RETURN);
          break;
        case EXTENDS:
          t = jj_consume_token(EXTENDS);
          break;
        case ARRAYOF:
          t = jj_consume_token(ARRAYOF);
          break;
        case BOOLEAN:
          t = jj_consume_token(BOOLEAN);
          break;
        case INT:
          t = jj_consume_token(INT);
          break;
        case IF:
          t = jj_consume_token(IF);
          break;
        case THEN:
          t = jj_consume_token(THEN);
          break;
        case ELSE:
          t = jj_consume_token(ELSE);
          break;
        case WHILE:
          t = jj_consume_token(WHILE);
          break;
        case DO:
          t = jj_consume_token(DO);
          break;
        case OUTPUT:
          t = jj_consume_token(OUTPUT);
          break;
        case LENGTH:
          t = jj_consume_token(LENGTH);
          break;
        case TRUE:
          t = jj_consume_token(TRUE);
          break;
        case FALSE:
          t = jj_consume_token(FALSE);
          break;
        case SELF:
          t = jj_consume_token(SELF);
          break;
        case NEW:
          t = jj_consume_token(NEW);
          break;
        case OBJECT:
          t = jj_consume_token(OBJECT);
          break;
        case ISNULL:
          t = jj_consume_token(ISNULL);
          break;
        case OPENCBR:
          t = jj_consume_token(OPENCBR);
          break;
        case CLOSECBR:
          t = jj_consume_token(CLOSECBR);
          break;
        case OPENB:
          t = jj_consume_token(OPENB);
          break;
        case CLOSEB:
          t = jj_consume_token(CLOSEB);
          break;
        case COMMA:
          t = jj_consume_token(COMMA);
          break;
        case OPENSBR:
          t = jj_consume_token(OPENSBR);
          break;
        case CLOSESBR:
          t = jj_consume_token(CLOSESBR);
          break;
        case EXPMARK:
          t = jj_consume_token(EXPMARK);
          break;
        case FSTOP:
          t = jj_consume_token(FSTOP);
          break;
        case SEMI:
          t = jj_consume_token(SEMI);
          break;
        default:
          jj_la1[1] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        System.out.println("Recognised as valid token: " + t.image);
        break;
      case INTEGER_LITERAL:
        t = jj_consume_token(INTEGER_LITERAL);
        System.out.println("Recognised as INTEGER_LITERAL: " + t.image);
        break;
      case OP:
        t = jj_consume_token(OP);
        System.out.println("Recognised as OP: " + t.image);
        break;
      case ID:
        t = jj_consume_token(ID);
        System.out.println("Recognised as ID: " + t.image);
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void nt_Program() throws ParseException {
    label_2:
    while (true) {
      nt_ProcDecl();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PROC:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_2;
      }
    }
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CLASS:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_3;
      }
      nt_ClassDecl();
    }
  }

  final public void nt_ClassDecl() throws ParseException {
    jj_consume_token(CLASS);
    jj_consume_token(ID);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case OPENCBR:
      jj_consume_token(OPENCBR);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ARRAYOF:
        case BOOLEAN:
        case INT:
          ;
          break;
        default:
          jj_la1[5] = jj_gen;
          break label_4;
        }
        nt_FieldDecl();
      }
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PROC:
        case FUN:
          ;
          break;
        default:
          jj_la1[6] = jj_gen;
          break label_5;
        }
        nt_MethodDecl();
      }
      jj_consume_token(CLOSECBR);
      break;
    case EXTENDS:
      jj_consume_token(EXTENDS);
      jj_consume_token(ID);
      jj_consume_token(OPENCBR);
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ARRAYOF:
        case BOOLEAN:
        case INT:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_6;
        }
        nt_FieldDecl();
      }
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PROC:
        case FUN:
          ;
          break;
        default:
          jj_la1[8] = jj_gen;
          break label_7;
        }
        nt_MethodDecl();
      }
      jj_consume_token(CLOSECBR);
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void nt_FieldDecl() throws ParseException {
    nt_Type();
    jj_consume_token(ID);
    jj_consume_token(SEMI);
  }

  final public void nt_MethodDecl() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PROC:
      nt_ProcDecl();
      break;
    case FUN:
      nt_FunDecl();
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void nt_ProcDecl() throws ParseException {
    jj_consume_token(PROC);
    jj_consume_token(ID);
    jj_consume_token(OPENB);
    nt_FormalList();
    jj_consume_token(CLOSEB);
    jj_consume_token(OPENCBR);
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ARRAYOF:
      case BOOLEAN:
      case INT:
      case IF:
      case WHILE:
      case OUTPUT:
      case TRUE:
      case FALSE:
      case SELF:
      case NEW:
      case ISNULL:
      case OPENCBR:
      case OPENB:
      case EXPMARK:
      case INTEGER_LITERAL:
      case ID:
        ;
        break;
      default:
        jj_la1[11] = jj_gen;
        break label_8;
      }
      nt_Statement();
    }
    jj_consume_token(CLOSECBR);
  }

  final public void nt_FunDecl() throws ParseException {
    jj_consume_token(FUN);
    nt_Type();
    jj_consume_token(ID);
    jj_consume_token(OPENB);
    nt_FormalList();
    jj_consume_token(CLOSEB);
    jj_consume_token(OPENCBR);
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ARRAYOF:
      case BOOLEAN:
      case INT:
      case IF:
      case WHILE:
      case OUTPUT:
      case TRUE:
      case FALSE:
      case SELF:
      case NEW:
      case ISNULL:
      case OPENCBR:
      case OPENB:
      case EXPMARK:
      case INTEGER_LITERAL:
      case ID:
        ;
        break;
      default:
        jj_la1[12] = jj_gen;
        break label_9;
      }
      nt_Statement();
    }
    jj_consume_token(RETURN);
    nt_Exp();
    jj_consume_token(SEMI);
    jj_consume_token(CLOSECBR);
  }

  final public void nt_FormalList() throws ParseException {
    nt_Type();
    jj_consume_token(ID);
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[13] = jj_gen;
        break label_10;
      }
      nt_FormalRest();
    }
  }

  final public void nt_FormalRest() throws ParseException {
    jj_consume_token(COMMA);
    nt_Type();
    jj_consume_token(ID);
  }

  final public void nt_Type() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ARRAYOF:
      jj_consume_token(ARRAYOF);
      jj_consume_token(OPENB);
      nt_Type();
      jj_consume_token(CLOSEB);
      break;
    case BOOLEAN:
      jj_consume_token(BOOLEAN);
      break;
    case INT:
      jj_consume_token(INT);
      break;
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void nt_Statement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case OPENCBR:
      nt_Block();
      break;
    case ARRAYOF:
    case BOOLEAN:
    case INT:
      nt_Type();
      jj_consume_token(ID);
      jj_consume_token(SEMI);
      break;
    case IF:
      jj_consume_token(IF);
      jj_consume_token(OPENB);
      nt_Exp();
      jj_consume_token(CLOSEB);
      jj_consume_token(THEN);
      nt_Block();
      jj_consume_token(ELSE);
      nt_Block();
      break;
    case WHILE:
      jj_consume_token(WHILE);
      jj_consume_token(OPENB);
      nt_Exp();
      jj_consume_token(CLOSEB);
      jj_consume_token(DO);
      nt_Block();
      break;
    case OUTPUT:
      jj_consume_token(OUTPUT);
      nt_Exp();
      jj_consume_token(SEMI);
      break;
    case TRUE:
    case FALSE:
    case SELF:
    case NEW:
    case ISNULL:
    case OPENB:
    case EXPMARK:
    case INTEGER_LITERAL:
    case ID:
      nt_PrimaryExp();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPENSBR:
        jj_consume_token(OPENSBR);
        nt_Exp();
        jj_consume_token(CLOSESBR);
        jj_consume_token(OP);
        nt_Exp();
        jj_consume_token(SEMI);
        break;
      case FSTOP:
        jj_consume_token(FSTOP);
        jj_consume_token(ID);
        jj_consume_token(OPENB);
        nt_ExpList();
        jj_consume_token(CLOSEB);
        jj_consume_token(COMMA);
        break;
      case OP:
        jj_consume_token(OP);
        nt_Exp();
        jj_consume_token(SEMI);
        break;
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[16] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void nt_Block() throws ParseException {
    jj_consume_token(OPENCBR);
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ARRAYOF:
      case BOOLEAN:
      case INT:
      case IF:
      case WHILE:
      case OUTPUT:
      case TRUE:
      case FALSE:
      case SELF:
      case NEW:
      case ISNULL:
      case OPENCBR:
      case OPENB:
      case EXPMARK:
      case INTEGER_LITERAL:
      case ID:
        ;
        break;
      default:
        jj_la1[17] = jj_gen;
        break label_11;
      }
      nt_Statement();
    }
    jj_consume_token(CLOSECBR);
  }

  final public void nt_Exp() throws ParseException {
    nt_PrimaryExp();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case OP:
      jj_consume_token(OP);
      nt_PrimaryExp();
      break;
    case OPENSBR:
      jj_consume_token(OPENSBR);
      nt_Exp();
      jj_consume_token(CLOSESBR);
      break;
    case FSTOP:
      jj_consume_token(FSTOP);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LENGTH:
        jj_consume_token(LENGTH);
        break;
      case ID:
        jj_consume_token(ID);
        jj_consume_token(OPENB);
        nt_ExpList();
        jj_consume_token(CLOSEB);
        break;
      default:
        jj_la1[18] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public Exp nt_PrimaryExp() throws ParseException {
  Token t;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INTEGER_LITERAL:
      t = jj_consume_token(INTEGER_LITERAL);
                          {if (true) return new ExpInteger(Integer.parseInt(t.image));}
      break;
    case TRUE:
      t = jj_consume_token(TRUE);
               {if (true) return new ExpTrue();}
      break;
    case FALSE:
      jj_consume_token(FALSE);
      break;
    case ID:
      nt_Var();
      break;
    case SELF:
      jj_consume_token(SELF);
      break;
    case NEW:
      jj_consume_token(NEW);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ARRAYOF:
        jj_consume_token(ARRAYOF);
        jj_consume_token(OPENB);
        nt_Type();
        jj_consume_token(CLOSEB);
        jj_consume_token(OPENSBR);
        nt_Exp();
        jj_consume_token(CLOSESBR);
        break;
      case OBJECT:
        jj_consume_token(OBJECT);
        jj_consume_token(ID);
        jj_consume_token(OPENB);
        nt_ExpList();
        jj_consume_token(CLOSEB);
        break;
      default:
        jj_la1[20] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    case EXPMARK:
      jj_consume_token(EXPMARK);
      nt_PrimaryExp();
      break;
    case ISNULL:
      jj_consume_token(ISNULL);
      nt_PrimaryExp();
      break;
    case OPENB:
      jj_consume_token(OPENB);
      nt_Exp();
      jj_consume_token(CLOSEB);
      break;
    default:
      jj_la1[21] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Var nt_Var() throws ParseException {
  Token t;
    t = jj_consume_token(ID);
             {if (true) return new Var(t.image);}
    throw new Error("Missing return statement in function");
  }

  final public void nt_ExpList() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case COMMA:
      nt_ExpRest();
      label_12:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[22] = jj_gen;
          break label_12;
        }
        nt_ExpRest();
      }
      break;
    default:
      jj_la1[23] = jj_gen;
      ;
    }
  }

  final public void nt_ExpRest() throws ParseException {
    jj_consume_token(COMMA);
    nt_Exp();
  }

  final public void eof() throws ParseException {
    jj_consume_token(0);
  }

  /** Generated Token Manager. */
  public MooplParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[24];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xffffff00,0xffffff00,0xffffff00,0x100,0x400,0xe000,0x300,0xe000,0x300,0x20000800,0x300,0xb7a9e000,0xb7a9e000,0x0,0xe000,0x0,0xb7a9e000,0xb7a9e000,0x400000,0x0,0x8002000,0x97800000,0x0,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x3ff,0x7f,0x3ff,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x290,0x290,0x2,0x0,0x124,0x290,0x290,0x200,0x124,0x0,0x290,0x2,0x2,};
   }

  /** Constructor with InputStream. */
  public MooplParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public MooplParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new MooplParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public MooplParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new MooplParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public MooplParser(MooplParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(MooplParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[42];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 24; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 42; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  }
