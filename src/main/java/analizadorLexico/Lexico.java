// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: Lexico.flex

package analizadorLexico;
import java_cup.runtime.*;
import java.util.*;
import java.lang.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import vista.VentanaPrincipal;


@SuppressWarnings("fallthrough")
public class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\2\4\22\0\1\1\1\5"+
    "\1\6\3\0\1\7\1\0\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\10\22\1\23"+
    "\1\24\1\25\1\26\1\27\2\0\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\31\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\31\1\47\1\50"+
    "\1\51\2\31\1\52\3\31\1\53\1\0\1\54\1\0"+
    "\1\55\1\0\1\31\1\56\30\31\1\0\1\57\10\0"+
    "\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\1\1\12\2\13\1\1\1\14"+
    "\1\15\1\1\1\16\11\17\1\20\1\21\2\1\1\22"+
    "\1\0\1\23\1\24\1\0\1\25\3\0\1\26\1\27"+
    "\1\30\1\31\1\0\4\17\1\32\7\17\1\33\1\0"+
    "\1\23\1\0\1\2\2\0\1\34\4\17\1\35\6\17"+
    "\1\0\1\23\1\2\1\0\1\36\1\17\1\37\5\17"+
    "\1\40\1\41\2\17\1\0\1\23\4\0\3\17\1\42"+
    "\2\17\1\43\1\44\1\0\1\23\3\0\1\2\4\17"+
    "\1\45\1\0\1\23\2\0\4\17\1\0\1\23\1\0"+
    "\1\2\1\0\2\17\2\0\1\23\1\0\2\17\2\0"+
    "\1\23\1\0\2\17\2\0\1\23\5\0\1\23\5\0"+
    "\1\23\5\0\1\23\5\0\1\23\1\46\2\0\1\47"+
    "\1\0\1\23\3\0\1\23\3\0\1\23\1\50\1\51"+
    "\1\0\1\23\1\0\1\23\1\0\1\23\1\0\1\23"+
    "\1\0\1\23\1\0\1\23\1\0\1\23\1\0\1\23"+
    "\1\0\1\23\1\0\1\23\1\0\1\23\1\0\1\23"+
    "\1\0\2\23";

  private static int [] zzUnpackAction() {
    int [] result = new int[217];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\60\0\60"+
    "\0\60\0\60\0\60\0\u0120\0\u0150\0\u0180\0\u01b0\0\u01e0"+
    "\0\u0210\0\60\0\u0240\0\u0270\0\u02a0\0\u02d0\0\u0300\0\u0330"+
    "\0\u0360\0\u0390\0\u03c0\0\u03f0\0\u0420\0\u0450\0\60\0\60"+
    "\0\u0480\0\u04b0\0\60\0\u04e0\0\u04e0\0\60\0\u0150\0\u0150"+
    "\0\u0510\0\u0540\0\u0570\0\60\0\60\0\60\0\60\0\u0480"+
    "\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u02d0\0\u0660\0\u0690\0\u06c0"+
    "\0\u06f0\0\u0720\0\u0750\0\u0780\0\60\0\u07b0\0\u07b0\0\u07e0"+
    "\0\60\0\u0810\0\u0840\0\60\0\u0870\0\u08a0\0\u08d0\0\u0900"+
    "\0\u02d0\0\u0930\0\u0960\0\u0990\0\u09c0\0\u09f0\0\u0a20\0\u0a50"+
    "\0\u0a50\0\u0a80\0\u0ab0\0\u0840\0\u0ae0\0\u02d0\0\u0b10\0\u0b40"+
    "\0\u0b70\0\u0ba0\0\u0bd0\0\u02d0\0\u02d0\0\u0c00\0\u0c30\0\u0c60"+
    "\0\u0c60\0\u0a80\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80"+
    "\0\u02d0\0\u0db0\0\u0de0\0\u02d0\0\u02d0\0\u0e10\0\u0e10\0\u0e40"+
    "\0\u0e70\0\u0ea0\0\u07e0\0\u0ed0\0\u0f00\0\u0f30\0\u0f60\0\u02d0"+
    "\0\u0f90\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050\0\u1080\0\u10b0"+
    "\0\u10e0\0\u10e0\0\u1110\0\u0810\0\u1140\0\u1170\0\u11a0\0\u11d0"+
    "\0\u1200\0\u1200\0\u1230\0\u1260\0\u1290\0\u12c0\0\u12f0\0\u12f0"+
    "\0\u1320\0\u1350\0\u1380\0\u13b0\0\u13e0\0\u13e0\0\u1410\0\u1440"+
    "\0\u1470\0\u14a0\0\u14d0\0\u14d0\0\u1500\0\u1530\0\u1560\0\u1590"+
    "\0\u15c0\0\u15c0\0\u15f0\0\u1620\0\u1650\0\u1680\0\u16b0\0\u16b0"+
    "\0\u16e0\0\u1710\0\u1740\0\u1770\0\u17a0\0\u17a0\0\60\0\u17d0"+
    "\0\u1800\0\60\0\u1830\0\u1830\0\u1860\0\u1890\0\u18c0\0\u18c0"+
    "\0\u18f0\0\u1920\0\u1950\0\u1950\0\60\0\60\0\u1980\0\u1980"+
    "\0\u19b0\0\u19b0\0\u19e0\0\u19e0\0\u1a10\0\u1a10\0\u1a40\0\u1a40"+
    "\0\u1a70\0\u1a70\0\u1aa0\0\u1aa0\0\u1ad0\0\u1ad0\0\u1b00\0\u1b00"+
    "\0\u1b30\0\u1b30\0\u1b60\0\u1b60\0\u1b90\0\u1b90\0\u1bc0\0\u1bc0"+
    "\0\60";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[217];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\2\20\1\21\1\22\1\23\1\24\1\25\3\26\1\27"+
    "\1\30\1\31\2\26\1\32\5\26\1\33\1\26\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\26\1\42\61\0"+
    "\2\3\1\0\1\3\101\0\1\43\31\0\2\44\3\0"+
    "\1\44\1\45\51\44\7\0\1\46\66\0\1\47\1\0"+
    "\3\20\55\0\3\50\54\0\1\51\56\0\1\50\1\0"+
    "\3\20\33\0\1\52\17\0\1\50\1\0\3\20\60\0"+
    "\1\53\2\0\1\54\57\0\1\55\57\0\1\56\57\0"+
    "\1\57\51\0\3\26\5\0\23\26\2\0\1\60\1\26"+
    "\21\0\3\26\5\0\4\26\1\61\16\26\2\0\1\60"+
    "\1\26\21\0\3\26\5\0\12\26\1\62\1\26\1\63"+
    "\6\26\2\0\1\60\1\26\21\0\3\26\5\0\12\26"+
    "\1\64\10\26\2\0\1\60\1\26\21\0\3\26\5\0"+
    "\5\26\1\65\6\26\1\66\6\26\2\0\1\60\1\26"+
    "\21\0\3\26\5\0\17\26\1\67\3\26\2\0\1\60"+
    "\1\26\21\0\3\26\5\0\21\26\1\70\1\26\2\0"+
    "\1\60\1\26\21\0\3\26\5\0\1\71\6\26\1\72"+
    "\13\26\2\0\1\60\1\26\21\0\3\26\5\0\7\26"+
    "\1\73\7\26\1\74\3\26\2\0\1\60\1\26\21\0"+
    "\3\26\5\0\23\26\3\0\1\26\60\0\1\75\2\76"+
    "\3\0\1\76\1\77\51\76\2\100\1\101\7\100\1\102"+
    "\45\100\2\103\3\0\53\103\26\0\1\104\51\0\3\26"+
    "\5\0\2\26\1\105\20\26\2\0\1\60\1\26\21\0"+
    "\3\26\5\0\20\26\1\106\2\26\2\0\1\60\1\26"+
    "\21\0\3\26\5\0\3\26\1\107\17\26\2\0\1\60"+
    "\1\26\21\0\3\26\5\0\15\26\1\110\5\26\2\0"+
    "\1\60\1\26\21\0\3\26\5\0\21\26\1\111\1\26"+
    "\2\0\1\60\1\26\21\0\3\26\5\0\15\26\1\112"+
    "\5\26\2\0\1\60\1\26\21\0\3\26\5\0\17\26"+
    "\1\113\3\26\2\0\1\60\1\26\21\0\3\26\5\0"+
    "\11\26\1\114\11\26\2\0\1\60\1\26\21\0\3\26"+
    "\5\0\4\26\1\115\16\26\2\0\1\60\1\26\21\0"+
    "\3\26\5\0\10\26\1\116\12\26\2\0\1\60\1\26"+
    "\21\0\3\26\5\0\10\26\1\117\12\26\2\0\1\60"+
    "\1\26\1\0\2\120\3\0\1\120\1\121\51\120\2\100"+
    "\1\101\55\100\2\102\1\122\7\102\1\123\45\102\20\0"+
    "\2\124\56\0\3\26\5\0\12\26\1\125\10\26\2\0"+
    "\1\60\1\26\21\0\3\26\5\0\4\26\1\126\16\26"+
    "\2\0\1\60\1\26\21\0\3\26\5\0\3\26\1\127"+
    "\12\26\1\130\4\26\2\0\1\60\1\26\21\0\3\26"+
    "\5\0\1\131\22\26\2\0\1\60\1\26\21\0\3\26"+
    "\5\0\6\26\1\132\14\26\2\0\1\60\1\26\21\0"+
    "\3\26\5\0\10\26\1\133\12\26\2\0\1\60\1\26"+
    "\21\0\3\26\5\0\4\26\1\134\16\26\2\0\1\60"+
    "\1\26\21\0\3\26\5\0\14\26\1\135\6\26\2\0"+
    "\1\60\1\26\21\0\3\26\5\0\12\26\1\136\10\26"+
    "\2\0\1\60\1\26\21\0\3\26\5\0\21\26\1\137"+
    "\1\26\2\0\1\60\1\26\1\0\2\140\3\0\1\140"+
    "\1\141\51\140\12\142\1\143\45\142\2\102\1\122\7\102"+
    "\1\144\4\102\1\145\40\102\20\0\3\26\5\0\1\146"+
    "\22\26\2\0\1\60\1\26\21\0\3\26\5\0\4\26"+
    "\1\147\16\26\2\0\1\60\1\26\21\0\3\26\5\0"+
    "\17\26\1\150\3\26\2\0\1\60\1\26\21\0\3\26"+
    "\5\0\21\26\1\151\1\26\2\0\1\60\1\26\21\0"+
    "\3\26\5\0\17\26\1\152\3\26\2\0\1\60\1\26"+
    "\21\0\3\26\5\0\14\26\1\153\6\26\2\0\1\60"+
    "\1\26\21\0\3\26\5\0\4\26\1\154\16\26\2\0"+
    "\1\60\1\26\21\0\3\26\5\0\4\26\1\155\16\26"+
    "\2\0\1\60\1\26\1\0\2\156\3\0\1\156\1\157"+
    "\51\156\12\142\1\160\4\142\1\161\40\142\2\102\1\122"+
    "\7\102\1\162\45\102\2\100\1\101\14\100\1\163\40\100"+
    "\20\0\3\26\5\0\17\26\1\164\3\26\2\0\1\60"+
    "\1\26\21\0\3\26\5\0\2\26\1\165\20\26\2\0"+
    "\1\60\1\26\21\0\3\26\5\0\15\26\1\166\5\26"+
    "\2\0\1\60\1\26\21\0\3\26\5\0\1\167\22\26"+
    "\2\0\1\60\1\26\21\0\3\26\5\0\6\26\1\170"+
    "\14\26\2\0\1\60\1\26\1\0\2\171\3\0\1\171"+
    "\1\172\51\171\12\142\1\173\45\142\17\0\1\101\40\0"+
    "\2\102\1\122\7\102\1\162\4\102\1\174\40\102\20\0"+
    "\3\26\5\0\4\26\1\175\16\26\2\0\1\60\1\26"+
    "\21\0\3\26\5\0\12\26\1\176\10\26\2\0\1\60"+
    "\1\26\21\0\3\26\5\0\6\26\1\177\14\26\2\0"+
    "\1\60\1\26\21\0\3\26\5\0\13\26\1\200\7\26"+
    "\2\0\1\60\1\26\1\0\2\201\3\0\1\201\1\202"+
    "\51\201\12\142\1\173\4\142\1\203\40\142\2\102\1\122"+
    "\7\102\1\123\4\102\1\204\40\102\16\0\1\205\1\0"+
    "\3\26\5\0\23\26\2\0\1\60\1\26\21\0\3\26"+
    "\5\0\1\206\22\26\2\0\1\60\1\26\21\0\3\26"+
    "\5\0\17\26\1\207\3\26\2\0\1\60\1\26\17\0"+
    "\1\210\1\0\3\26\5\0\23\26\2\0\1\60\1\26"+
    "\1\0\2\211\3\0\1\211\1\212\51\211\12\142\1\143"+
    "\4\142\1\122\40\142\50\0\1\213\27\0\3\26\5\0"+
    "\17\26\1\214\3\26\2\0\1\60\1\26\21\0\3\26"+
    "\5\0\1\215\22\26\2\0\1\60\1\26\51\0\1\216"+
    "\7\0\2\217\3\0\1\217\1\220\51\217\34\0\1\221"+
    "\43\0\3\26\5\0\4\26\1\222\16\26\2\0\1\60"+
    "\1\26\21\0\3\26\5\0\13\26\1\223\7\26\2\0"+
    "\1\60\1\26\35\0\1\224\23\0\2\225\3\0\1\225"+
    "\1\226\51\225\32\0\1\227\43\0\1\230\1\0\3\26"+
    "\5\0\23\26\2\0\1\60\1\26\17\0\1\231\1\0"+
    "\3\26\5\0\23\26\2\0\1\60\1\26\33\0\1\232"+
    "\25\0\2\233\3\0\1\233\1\234\51\233\51\0\1\235"+
    "\56\0\1\236\57\0\1\237\60\0\1\240\6\0\2\241"+
    "\3\0\1\241\1\242\51\241\40\0\1\243\53\0\1\244"+
    "\57\0\1\245\63\0\1\246\17\0\2\247\3\0\1\247"+
    "\1\250\51\247\45\0\1\251\44\0\1\252\57\0\1\253"+
    "\72\0\1\254\12\0\2\255\3\0\1\255\1\256\51\255"+
    "\44\0\1\257\64\0\1\260\57\0\1\261\52\0\1\262"+
    "\13\0\2\263\3\0\1\263\1\264\51\263\40\0\1\265"+
    "\57\0\1\266\17\0\2\267\3\0\1\267\1\270\51\267"+
    "\45\0\1\271\57\0\1\272\12\0\2\273\3\0\1\273"+
    "\1\274\51\273\44\0\1\275\57\0\1\276\13\0\2\277"+
    "\3\0\1\277\1\300\51\277\2\301\3\0\1\301\1\302"+
    "\51\301\2\303\3\0\1\303\1\304\51\303\2\305\3\0"+
    "\1\305\1\306\51\305\2\307\3\0\1\307\1\310\51\307"+
    "\2\311\3\0\1\311\1\312\51\311\2\313\3\0\1\313"+
    "\1\314\51\313\2\315\3\0\1\315\1\316\51\315\2\317"+
    "\3\0\1\317\1\320\51\317\2\321\3\0\1\321\1\322"+
    "\51\321\2\323\3\0\1\323\1\324\51\323\2\325\3\0"+
    "\1\325\1\326\51\325\2\327\3\0\1\327\1\330\51\327"+
    "\6\0\1\331\51\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[7152];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\5\11\6\1\1\11\14\1\2\11"+
    "\2\1\1\11\1\0\1\1\1\11\1\0\1\1\3\0"+
    "\4\11\1\0\14\1\1\11\1\0\1\1\1\0\1\11"+
    "\2\0\1\11\13\1\1\0\2\1\1\0\14\1\1\0"+
    "\1\1\4\0\10\1\1\0\1\1\3\0\6\1\1\0"+
    "\1\1\2\0\4\1\1\0\1\1\1\0\1\1\1\0"+
    "\2\1\2\0\1\1\1\0\2\1\2\0\1\1\1\0"+
    "\2\1\2\0\1\1\5\0\1\1\5\0\1\1\5\0"+
    "\1\1\5\0\1\1\1\11\2\0\1\11\1\0\1\1"+
    "\3\0\1\1\3\0\1\1\2\11\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[217];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
/*
    List<String[]> tabla_de_simbolos = new ArrayList<>();

void guardarTablaSimbolos() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("tabla_de_simbolos.txt"))) {
        // Columnas
        writer.write(String.format("%-50s %-15s %-20s %-50s %-5s", "Nombre", "Token", "Tipo", "Valor", "Long"));
        writer.newLine();
        writer.write("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        writer.newLine();

        // Filas
        for (String[] simbolo : tabla_de_simbolos) {
            writer.write(String.format("%-50s %-15s %-20s %-50s %-5s", simbolo[0], simbolo[1], simbolo[2], simbolo[3], simbolo[4]));
            writer.newLine();
        }

    } catch (IOException e) {
        System.err.println("Error al escribir la tabla de símbolos en el archivo: " + e.getMessage());
    }
}
*/


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
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
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
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
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

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
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
        // peek one character ahead if it is
        // (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new Error("Caracter inválido: <" + yytext() + "> en la linea " + yyline);
            }
          // fall through
          case 42: break;
          case 2:
            { 
            }
          // fall through
          case 43: break;
          case 3:
            { return new Symbol(sym.NEGACION, yyline, yycolumn,yytext());
            }
          // fall through
          case 44: break;
          case 4:
            { return new Symbol(sym.PAR_APERTURA, yyline, yycolumn,yytext());
            }
          // fall through
          case 45: break;
          case 5:
            { return new Symbol(sym.PAR_CIERRE, yyline, yycolumn,yytext());
            }
          // fall through
          case 46: break;
          case 6:
            { return new Symbol(sym.OP_POR, yyline, yycolumn,yytext());
            }
          // fall through
          case 47: break;
          case 7:
            { return new Symbol(sym.OP_SUMA, yyline, yycolumn,yytext());
            }
          // fall through
          case 48: break;
          case 8:
            { return new Symbol(sym.SEP_LIST, yyline, yycolumn,yytext());
            }
          // fall through
          case 49: break;
          case 9:
            { return new Symbol(sym.OP_RESTA, yyline, yycolumn,yytext());
            }
          // fall through
          case 50: break;
          case 10:
            { return new Symbol(sym.OP_DIVISION, yyline, yycolumn,yytext());
            }
          // fall through
          case 51: break;
          case 11:
            { String largo = String.valueOf(yytext());
    int valor = Integer.parseInt(yytext());
    if (valor < -32768 || valor > 32767 || largo.length() > 10)  {
        throw new Error("Caracter inválido: <" + yytext() + "> en la linea " + yyline + " excede el limite de tamaño");
    } else {
        /*
        String[] simbolo = {"_" + yytext(), "CONST_INT", "_", yytext(), "_"};
        tabla_de_simbolos.add(simbolo);
        guardarTablaSimbolos();
        */
        return new Symbol(sym.CONST_INT,yyline, yycolumn,yytext());
    }
            }
          // fall through
          case 52: break;
          case 12:
            { return new Symbol(sym.END_LINE, yyline, yycolumn,yytext());
            }
          // fall through
          case 53: break;
          case 13:
            { return new Symbol(sym.MENOR, yyline, yycolumn,yytext());
            }
          // fall through
          case 54: break;
          case 14:
            { return new Symbol(sym.MAYOR, yyline, yycolumn,yytext());
            }
          // fall through
          case 55: break;
          case 15:
            { /*
    String id = yytext();
    boolean existe = false;

    for (String[] simbolo : tabla_de_simbolos) {
        if (simbolo[0].equals(id)) {
            existe = true;
            break;
        }
    }

    if (!existe) {
        String[] simbolo = {id, "ID", "_", "_", "_"};
        tabla_de_simbolos.add(simbolo);
    }
    guardarTablaSimbolos();
    */

    return new Symbol(sym.ID,yyline, yycolumn,yytext());
            }
          // fall through
          case 56: break;
          case 16:
            { return new Symbol(sym.COR_APERTURA, yyline, yycolumn,yytext());
            }
          // fall through
          case 57: break;
          case 17:
            { return new Symbol(sym.COR_CIERRE, yyline, yycolumn,yytext());
            }
          // fall through
          case 58: break;
          case 18:
            { return new Symbol(sym.DISTINTO, yyline, yycolumn,yytext());
            }
          // fall through
          case 59: break;
          case 19:
            { String value = yytext();
    if (value.length() > 32) {
        throw new Error("Caracter inválido: <" + yytext() + "> en la linea " + yyline + " excede el limite de caracteres");
    } else {
        /*
        String[] simbolo = {"_" + yytext(), "CONST_STR", "_", yytext(), String.valueOf(value.length())};
        tabla_de_simbolos.add(simbolo);
        guardarTablaSimbolos();
        */
        return new Symbol(sym.CONST_STR, yyline, yycolumn,yytext());
    }
            }
          // fall through
          case 60: break;
          case 20:
            { return new Symbol(sym.AND, yyline, yycolumn,yytext());
            }
          // fall through
          case 61: break;
          case 21:
            { float valor = Float.parseFloat(yytext());
    if (valor < -3.4028235E38 || valor > 3.4028235E38) {
        throw new Error("Caracter inválido: <" + yytext() + "> en la linea " + yyline + " excede el limite de tamaño");
    } else {
        /*
        String[] simbolo = {"_" + yytext(), "CONST_FLOAT", "_", yytext(), "_"};
        tabla_de_simbolos.add(simbolo);
        guardarTablaSimbolos();
        */
        return new Symbol(sym.CONST_FLOAT, yyline, yycolumn,yytext());
    }
            }
          // fall through
          case 62: break;
          case 22:
            { return new Symbol(sym.DECLARA, yyline, yycolumn,yytext());
            }
          // fall through
          case 63: break;
          case 23:
            { return new Symbol(sym.MENOR_IGUAL, yyline, yycolumn,yytext());
            }
          // fall through
          case 64: break;
          case 24:
            { return new Symbol(sym.IGUAL, yyline, yycolumn,yytext());
            }
          // fall through
          case 65: break;
          case 25:
            { return new Symbol(sym.MAYOR_IGUAL, yyline, yycolumn,yytext());
            }
          // fall through
          case 66: break;
          case 26:
            { return new Symbol(sym.IF, yyline, yycolumn,yytext());
            }
          // fall through
          case 67: break;
          case 27:
            { return new Symbol(sym.OR, yyline, yycolumn,yytext());
            }
          // fall through
          case 68: break;
          case 28:
            { return new Symbol(sym.ASIGN, yyline, yycolumn,yytext());
            }
          // fall through
          case 69: break;
          case 29:
            { return new Symbol(sym.TIPO_INT, yyline, yycolumn,yytext());
            }
          // fall through
          case 70: break;
          case 30:
            { return new Symbol(sym.CONST_BIN, yyline, yycolumn,yytext());
            }
          // fall through
          case 71: break;
          case 31:
            { return new Symbol(sym.ELSE, yyline, yycolumn,yytext());
            }
          // fall through
          case 72: break;
          case 32:
            { return new Symbol(sym.TAKE, yyline, yycolumn,yytext());
            }
          // fall through
          case 73: break;
          case 33:
            { return new Symbol(sym.THEN, yyline, yycolumn,yytext());
            }
          // fall through
          case 74: break;
          case 34:
            { return new Symbol(sym.TIPO_FLOAT, yyline, yycolumn,yytext());
            }
          // fall through
          case 75: break;
          case 35:
            { return new Symbol(sym.WHILE, yyline, yycolumn,yytext());
            }
          // fall through
          case 76: break;
          case 36:
            { return new Symbol(sym.WRITE, yyline, yycolumn,yytext());
            }
          // fall through
          case 77: break;
          case 37:
            { return new Symbol(sym.TIPO_STRING, yyline, yycolumn,yytext());
            }
          // fall through
          case 78: break;
          case 38:
            { return new Symbol(sym.DECLARE_SECTION, yyline, yycolumn,yytext());
            }
          // fall through
          case 79: break;
          case 39:
            { return new Symbol(sym.PROGRAM_SECTION, yyline, yycolumn,yytext());
            }
          // fall through
          case 80: break;
          case 40:
            { return new Symbol(sym.ENDDECLARE_SECTION, yyline, yycolumn,yytext());
            }
          // fall through
          case 81: break;
          case 41:
            { return new Symbol(sym.ENDPROGRAM_SECTION, yyline, yycolumn,yytext());
            }
          // fall through
          case 82: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
