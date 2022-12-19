public class Character
{  
    
    String name;
    String element;
    
    Character(String name, String element)
    {
        this.name = name;
        this.element = element;
    }

    public String getName()
    {
        return this.name;
    }

    public String getElement()
    {
        return this.element;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setElement(String element)
    {
        this.element = element;
    }
}  