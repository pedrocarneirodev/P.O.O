public class Quilometragem{
int quilometros, quilometragem, total;
int litros;
int viagem;

public Quilometragem(int quilometros, int litros){
	this.quilometros = quilometros;
	this.litros = litros;
}
public void setQuilometragem(int quilometros, int litros){
	this.quilometragem = quilometros/litros;
}
public int getQuilometragem(){
	return quilometragem;
}
}

