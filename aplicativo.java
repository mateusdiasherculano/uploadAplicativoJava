public class aplicativo {


    public void gerarNovaFrase(View view) {

        String[] frases = {
                "Não leve a vida tão a sério. Você nunca sairá vivo dela",
                "No dia que suor der dinheiro, pobre nasce sem sovaco.",
                "Não deixe que nada te desanime, pois até um pé na bunda te empurra para a frente.",
                "Em briga de saci qualquer chute é uma voadora.",
                "Não importa a cor do céu. Quem faz o dia bonito é você."
        };

        int numero = new Random().nextInt(5);


        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frases [numero]);



    }
}

