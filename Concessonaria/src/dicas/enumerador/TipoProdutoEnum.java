package dicas.enumerador;

public enum TipoProdutoEnum {

    ELETRODOMESTICO(1, "eletrodomestico"),
    PERECIVEL(2, "perecivel");

    private int id;
    private String descricao;

    private TipoProdutoEnum(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public static TipoProdutoEnum obterPorId(int id){
        for (TipoProdutoEnum e: TipoProdutoEnum.values()) {
            if (e.getId() == id){
                return e;
            }
        }
        throw new IllegalArgumentException("Id de tipo produto inexistente");
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

}
