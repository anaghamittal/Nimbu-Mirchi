import java.io.*;
class TotalV extends StockFile
{
    public static void main(String args[])throws IOException
    {
        StockV obj1=new StockV();
        StockFile obj=new StockFile();
        for(int i=0;i<20;i++)
        {
            obj.total=obj.total+obj1.veg[i]*obj.pricev[i];
        }
    }
}