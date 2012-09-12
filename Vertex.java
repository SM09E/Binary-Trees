package BinT;
public class Vertex 
{
    public Vertex Left_V;
    public Vertex Right_V;
    private Double Index; 
    
    public Vertex(double id)
    {
        this.Index=id;
    }
    
    public void AddVert(Vertex Vert, double id)
    {
        if (Vert.Index<id)
        {
            if (Vert.Left_V!=null) AddVert(Vert.Left_V, id);
            else Vert.Left_V = new Vertex(id);
        }
        else if (Vert.Index>id)
        {
            if (Vert.Right_V!=null) AddVert(Vert.Right_V, id);
            else Vert.Right_V = new Vertex(id);
        }
    }
    
    public void CreateTree(Vertex root, int cnt)
    {
        for (int i=0; i<cnt;i++)
        {
            root.AddVert(root, Math.random());
            System.out.println("Vertex "+(i+1)+" added");
        }
    }
    
}
