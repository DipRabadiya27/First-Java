package String;

public class s4 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Dip");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));
        
        //set char at index
        sb.setCharAt(0,'M');
        System.out.println(sb);

        //insert 
        sb.insert(0,'s');
        System.out.println(sb);

        // delete
        sb.delete(0,1);
        System.out.println(sb);

        //last add char
        sb.append(" R"); //for string  str = str + "R"
        sb.append("a");
        sb.append("b");
        sb.append("a");
        sb.append("d");
        sb.append("i");
        sb.append("y");
        sb.append("a");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}