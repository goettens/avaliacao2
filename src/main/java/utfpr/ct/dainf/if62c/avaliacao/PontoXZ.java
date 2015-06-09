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
public class PontoXZ extends Ponto2D {
    
    private double x;
    private double y;
    private double z;

    public PontoXZ() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public PontoXZ(double x, double z) {
        this.x = x;
        this.y = 0;
        this.z = z;
    }
    @Override
    public String toString(){
        return String.format("%s(%f,%f)",this.getNome(),this.x,this.z);
    }   
}
