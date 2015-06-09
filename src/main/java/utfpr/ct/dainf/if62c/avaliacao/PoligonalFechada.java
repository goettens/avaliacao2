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
            comprimento += Math.sqrt(Math.pow(this.vertices[i-1].x-this.vertices[i].x,2)+
                Math.pow(this.vertices[i-1].y-this.vertices[i].y,2)+Math.pow(this.vertices[i-1].z-this.vertices[i].z,2));
           i++;
        }
         comprimento += vertices[0].dist(vertices[i+1]);
        
        return comprimento;
    }
    
    
}
