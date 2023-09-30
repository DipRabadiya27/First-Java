package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Base64.Decoder;
import java.math.RoundingMode;  
import java.text.DecimalFormat;  

// public class practises {
//     public static void main(String[] args) {
//         String s = "  this  is  a sentence  ";
//         int space = 0;
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == ' ') {
//                 space++;
//             }
//         }
//         System.out.println("Space: " + space);

//         s = s.trim();
//         int word = 1;
//         for (int i = 0; i < s.length(); i++) {
//             if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
//                 word++;
//             }
//         }
//         System.out.println("word: " + word);

//         int equalSpace = space / (word - 1);
//         System.out.println(equalSpace);

//         String arr[] = s.split(" ");
//         List<String> list = new ArrayList<>();
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != " " && arr[i] != "") {
//                 list.add(arr[i]);
//             }
//         }
//         System.out.println(list);

//         list.remove(1);
//         list.remove(2);
//         System.out.println(list);
        
//         StringBuilder sb=new StringBuilder();
//         for(int i=0;i<list.size();i++){
//             sb.append(arr[i]);
//             sb.append("  ");
//         }
//         System.out.println(sb);
//     }
// }

public class practises {
  /**
   */
  public static void main(Strings[] args) {
  //   String text = "  this  is  a sentence  ";

  //   System.out.println(reorderSpaces(text));
  // }

  // private static String reorderSpaces(String text) {
  //   if (!text.contains(" ")) return text;
  //   int spaces = 0;
  //   for (int i = 0; i < text.length(); i++) if (text.charAt(i) == ' ') spaces++;
  //   List<String> wordList = new ArrayList<>();
  //   int pointer;
  //   for (int i = 0; i < text.length(); i++) {
  //     if (text.charAt(i) != ' ') {
  //       pointer = i;
  //       while (pointer < text.length() && text.charAt(pointer) != ' ') {
  //         pointer++;
  //       }
  //       wordList.add(text.substring(i, pointer));
  //       i = pointer;
  //     }
  //   }
  //   System.out.println(wordList);
  //   StringBuilder sb = new StringBuilder();
  //   if (wordList.size() == 1) {
  //     sb.append(wordList.get(0));
  //     while (spaces != 0) {
  //       sb.append(" ");
  //       spaces--;
  //     }
  //   } else {
  //     int requiredSpace = spaces / (wordList.size() - 1);
  //     for (String str : wordList) {
  //       sb.append(str);
  //       int appendedSpace = 0;
  //       while (spaces != 0 && appendedSpace != requiredSpace) {
  //         sb.append(" ");
  //         spaces--;
  //         appendedSpace++;
  //       }
  //     }
  //   }
  //   while (spaces != 0) {
  //     sb.append(" ");
  //     spaces--;
  //   }
  //   return sb.toString();
  // double sum = 0;
    String[] word = {"cat","bt","hat","tree"};
    String chars = "atach";
    char[] ch = chars.toCharArray();
    System.out.println(ch);
    
    }
}