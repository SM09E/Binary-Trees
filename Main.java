package BinT;
public class Main 
{
    public static int temp=0;
    public static void main(String[] args)
    {
        Vertex root = new Vertex(0.5);
        root.CreateTree(root, 25);
        System.out.println("==============================================");
        Walk(root);
        System.out.println(temp);
    }
    
    public static void Walk(Vertex Vert)
    {
        if (Vert.Left_V!=null)
        Walk(Vert.Left_V);
        temp++;
        if (Vert.Right_V!=null)
        Walk(Vert.Right_V);
    }
}
