import java.util.ArrayList;

public class MyCharacter
{  
    static ArrayList<Character> characters = new ArrayList<Character>();
    static Character Nahida = new Character("Nahida","Dendro");
    static Character Ganyu = new Character("Ganyu","Cryo");
    static Character Yaoyao = new Character("Yaoyao","Dendro");
    static Character Hutao = new Character("Hu Tao","Pyro");
   
    public static void main(String args[])
    {  
        characters.add(Ganyu);
        characters.add(Nahida);
        characters.add(Yaoyao);
        characters.add(Hutao);
        int i = 1;
        System.out.println("Printing genshin characters");  
        for(Character c:characters)
        {
            System.out.println("My #" + i + " favorite genshin character is " + c.getName() + ", " + c.getName() + " is a "+c.getElement() + " character.");
            i++;
        }
    }  
}  