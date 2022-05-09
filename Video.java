package projeto001;
public class Video implements AcoesVideo {
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;

	public Video (String titulo){
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	public String getTitulo(){
		return titulo;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public int getAvaliacao(){
		return avaliacao;
	}
	public int setAvaliacao(){
		int nova;
		nova = (this.avaliacao + avaliacao)/this.views
		this.avaliacao = nova;
	}
	public int getViews(){
		return views;
	}
	public int setViews(){
		this.views = views;
	}
	public boolean isReproduzindo(){
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo){
		this.reproduzindo = reproduzindo;
	}


	
	@Override
	public void play(){
		this.reproduzindo= True;
	}
	@Override
	public void pause(){
		this.reproduzindo=False; 
	}
	@Override
	public void like(){
		this.curtidas++;
	}
	
	
	@Override
	public String toString(){
		return "Video{"+"titulo="+titulo+", avaliacao="+
			avaliacao+", view="+views+", curtidas="
            +curtidas+", reproduzindo="+reproduzindo+'}';
	}
	
}
