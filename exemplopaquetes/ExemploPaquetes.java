
package exemplopaquetes;
import triangulo.Area;
import triangulo.Perimetro;
import rectangulo.*;
import com.orlando.circulo.*;
import libreria.validar;
public class ExemploPaquetes {

    public static void main(String[] args) {
        //para calcular el area del triangulo
        
         triangulo.Area tri = new triangulo.Area();
        tri.areaTriangulo(6f, 2f);
        Perimetro per = new Perimetro();
        per.periTrianguloIsosceles(6, 2);
        MeusMetodos aux = new MeusMetodos();
        float base=aux.validaFloatPositivo();
        float altura= aux.validaFloatPositivo();
       rectangulo.Area rec = new rectangulo.Area();
        rec.areaRectangulo(base, altura);
        
        //utilizando metodos de acceso STATIC
        float b = MeusMetodos.darValor();
        float alt = MeusMetodos.darValor();
        rec.areaRectangulo(b, alt);
        
        //Simplificando
        rec.areaRectangulo(MeusMetodos.darValor(),MeusMetodos.darValor());
        rec.areaRectangulo(validar.validaFloatPositivo(),validar.validaFloatPositivo());
           
                
    }
    
}
