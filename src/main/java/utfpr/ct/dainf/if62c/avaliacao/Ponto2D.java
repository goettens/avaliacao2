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
public abstract class Ponto2D extends Ponto{
    public double x;
    public double y;
    public double z;
    
    protected Ponto2D(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    protected Ponto2D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
        
}
