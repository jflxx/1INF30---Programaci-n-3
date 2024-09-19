import java.util.ArrayList;
import com.pucp.FiguraGeometrica;
import com.pucp.Circulo;
import com.pucp.Triangulo;

public class App
{
	public static void main(String[] arg){
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Triangulo(20, 16, 5, 4, 3));
        figuras.add(new Circulo(15));
        for (FiguraGeometrica f : figuras) {
            System.out.println(f);
            System.out.println("\t area:"+f.calcularArea() + ", perimetro:"+f.calcularPerimetro());            
        }
    }
}