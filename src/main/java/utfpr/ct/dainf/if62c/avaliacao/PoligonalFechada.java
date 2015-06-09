/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author Guilherme
 */
public class PoligonalFechada extends Poligonal{

    public PoligonalFechada(int n) {
        super(n);
    }
    
    @Override
    public double getComprimento(){
        double comprimento = 0;
        int i = 0;
        
        while (i < n-1){
            comprimento = vertices[i].dist(vertices[i+1]);
        }
        comprimento += Math.sqrt(Math.pow(vertices[0].x-vertices[n-1].x,2)+
                Math.pow(vertices[0].y-vertices[n-1].y,2)+Math.pow(vertices[0].z-vertices[n-1].z,2));
        
        return comprimento;
    }
    
    
}
