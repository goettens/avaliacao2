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
public class Poligonal {
    int n;
    char plano = 'p';
    Ponto2D[] vertices;
    
    protected Poligonal(int n){
        this.n = n;
        if(this.n <=2){
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        }
        vertices = new Ponto2D[this.n];
    }

    public int getN() {
        return this.n;
    }
    
    public Ponto2D get(int n){
        try{
            return vertices[n-1];
        }catch(Exception e){
            return null;
        }
    }
    
    public void set(int n, Ponto2D vert){
        if (plano == 'x' && vert.x != 0){
            throw new RuntimeException("Vértices devem estar no mesmo plano");
        }
        else if (plano == 'y' && vert.y != 0){
            throw new RuntimeException("Vértices devem estar no mesmo plano");
        }
        else if (plano == 'z' && vert.z != 0){
            throw new RuntimeException("Vértices devem estar no mesmo plano");
        }
        
        try{
            vertices[n-1] = vert;
        }catch(Exception e){}
        
        if(this.plano == 'p' && vert.x == 0){
            this.plano = 'x';
        }
        else if(this.plano == 'p' && vert.y == 0){
            this.plano = 'y';
        }
        else if(this.plano == 'p' && vert.z == 0){
            this.plano = 'z';
        }
    }
    
    public double getComprimento(){
        double comprimento = 0;
        int i = 0;
        while(i<this.n){
            comprimento += Math.sqrt(Math.pow(this.vertices[i-1].x-this.vertices[i].x,2)+
                    Math.pow(this.vertices[i-1].y-this.vertices[i].y,2)+Math.pow(this.vertices[i-1].z-this.vertices[i].z,2));
            i++;
        }
        return comprimento;
    }
    
    
}
