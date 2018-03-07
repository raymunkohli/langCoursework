/* Generated By:JavaCC: Do not edit this line. MooplParserTokenManager.java */
import syntaxtree.*;
import syntaxtree.interp.*;
import java.util.List;
import java.util.LinkedList;

/** Token Manager. */
public class MooplParserTokenManager implements MooplParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 41;
            return 2;
         }
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 41;
            return 8;
         }
         if ((active0 & 0x1fefdf00L) != 0L)
         {
            jjmatchedKind = 41;
            return 11;
         }
         return -1;
      case 1:
         if ((active0 & 0x110000L) != 0L)
            return 11;
         if ((active0 & 0x1feeff00L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
            return 11;
         }
         return -1;
      case 2:
         if ((active0 & 0x1bee7d00L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 2;
            return 11;
         }
         if ((active0 & 0x4008200L) != 0L)
            return 11;
         return -1;
      case 3:
         if ((active0 & 0x19687c00L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 3;
            return 11;
         }
         if ((active0 & 0x2860100L) != 0L)
            return 11;
         return -1;
      case 4:
         if ((active0 & 0x1080400L) != 0L)
            return 11;
         if ((active0 & 0x18607800L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 4;
            return 11;
         }
         return -1;
      case 5:
         if ((active0 & 0x6800L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 5;
            return 11;
         }
         if ((active0 & 0x18601000L) != 0L)
            return 11;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 36);
      case 40:
         return jjStopAtPos(0, 31);
      case 41:
         return jjStopAtPos(0, 32);
      case 44:
         return jjStopAtPos(0, 33);
      case 46:
         return jjStopAtPos(0, 37);
      case 59:
         return jjStopAtPos(0, 38);
      case 91:
         return jjStopAtPos(0, 34);
      case 93:
         return jjStopAtPos(0, 35);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x40800L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x1000200L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x10018000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x8200000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x820000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 123:
         return jjStopAtPos(0, 29);
      case 125:
         return jjStopAtPos(0, 30);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x6401000L);
      case 102:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(1, 16, 11);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0xa0000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x40400L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 111:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(1, 20, 11);
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x802100L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x200200L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 106:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x3000000L);
      case 110:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 11);
         return jjMoveStringLiteralDfa3_0(active0, 0x10400000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x4100L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 116:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 11);
         return jjMoveStringLiteralDfa3_0(active0, 0x201800L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 119:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(2, 26, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 99:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 11);
         break;
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(3, 18, 11);
         else if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(3, 23, 11);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000800L);
      case 102:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 25, 11);
         break;
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x84000L);
      case 110:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 11);
         break;
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000400L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x10001000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000L);
      case 101:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 11);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(4, 24, 11);
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 115:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(4, 10, 11);
         break;
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 121:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 104:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(5, 22, 11);
         break;
      case 108:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(5, 28, 11);
         break;
      case 110:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(5, 12, 11);
         break;
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 116:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(5, 21, 11);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(5, 27, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 102:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(6, 13, 11);
         break;
      case 110:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(6, 14, 11);
         break;
      case 115:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(6, 11, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 24;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                     jjCheckNAdd(0);
                  }
                  else if ((0x10002c0000000000L & l) != 0L)
                  {
                     if (kind > 40)
                        kind = 40;
                  }
                  else if (curChar == 47)
                     jjAddStates(0, 1);
                  else if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(0);
                  break;
               case 4:
                  if ((0x10002c0000000000L & l) != 0L && kind > 40)
                     kind = 40;
                  break;
               case 5:
                  if (curChar == 61 && kind > 40)
                     kind = 40;
                  break;
               case 6:
                  if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 12:
                  if (curChar == 47)
                     jjAddStates(0, 1);
                  break;
               case 13:
                  if (curChar == 47)
                     jjCheckNAddStates(2, 4);
                  break;
               case 14:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 15:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 16:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 17:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(19, 20);
                  break;
               case 19:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(19, 20);
                  break;
               case 20:
                  if (curChar == 42)
                     jjCheckNAddStates(5, 7);
                  break;
               case 21:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(22, 20);
                  break;
               case 22:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(22, 20);
                  break;
               case 23:
                  if (curChar == 47 && kind > 7)
                     kind = 7;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 8:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 3:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAdd(11);
                  }
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 1:
                  if (curChar == 100 && kind > 40)
                     kind = 40;
                  break;
               case 7:
                  if (curChar == 118 && kind > 40)
                     kind = 40;
                  break;
               case 9:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 11:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 14:
                  jjAddStates(2, 4);
                  break;
               case 19:
                  jjCheckNAddTwoStates(19, 20);
                  break;
               case 21:
               case 22:
                  jjCheckNAddTwoStates(22, 20);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 14:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 4);
                  break;
               case 19:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(19, 20);
                  break;
               case 21:
               case 22:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(22, 20);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 24 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   13, 18, 14, 15, 17, 20, 21, 23, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\160\162\157\143", 
"\146\165\156", "\143\154\141\163\163", "\145\170\164\145\156\144\163", 
"\162\145\164\165\162\156", "\141\162\162\141\171\157\146", "\142\157\157\154\145\141\156", 
"\151\156\164", "\151\146", "\164\150\145\156", "\145\154\163\145", "\167\150\151\154\145", 
"\144\157", "\157\165\164\160\165\164", "\154\145\156\147\164\150", "\164\162\165\145", 
"\146\141\154\163\145", "\163\145\154\146", "\156\145\167", "\157\142\152\145\143\164", 
"\151\163\156\165\154\154", "\173", "\175", "\50", "\51", "\54", "\133", "\135", "\41", "\56", "\73", null, 
null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3ffffffff01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[24];
private final int[] jjstateSet = new int[48];
protected char curChar;
/** Constructor. */
public MooplParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public MooplParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 24; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
