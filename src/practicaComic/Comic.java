package practicaComic;

public class Comic {
    private  int paginas;
    private String titulo, genero, autor, descripcion;

    public Comic(int paginas, String titulo, String genero, String autor, String descripcion){
        this.paginas = paginas;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    public int getPaginas(){  return paginas;  }
    public String getTitulo(){  return titulo;  }
    public String getGenero(){  return genero;  }
    public String getAutor(){  return autor;  }
    public String getDescripcion(){  return descripcion;  }

    public boolean setPaginas(int paginas){
        if(paginas > 0){
            this.paginas = paginas;
            return true;
        }else
            return false;
    }
    public boolean setTitulo(String titulo){
        if(!titulo.isEmpty()){
            this.titulo = titulo;
            return true;
        }else
            return false;
    }
    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }
    public boolean setAutor(String autor){
        if(!autor.isEmpty()){
            this.autor = autor;
            return true;
        }else
            return false;
    }
    public boolean setDescripcion(String descripcion){
        if(!descripcion.isEmpty()){
            this.descripcion = descripcion;
            return true;
        }else
            return false;
    }
    public String showMessage(){
        return
                "Soy un practicaComic.Comic con las siguientes caracteristicas:\n"+
                        "Nombre: "+titulo+"\n"+
                        "Genero: "+genero+"\n"+
                        "Autor: "+autor+"\n"+
                        "Sinopsis:"+descripcion+"\n"+"\n";
    }
}
