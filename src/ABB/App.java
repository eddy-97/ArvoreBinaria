package ABB;


    
     class No {
        int valor;
        No esquerda;
        No direita;

        public No(int item) {
            valor = item;
            esquerda = direita = null;
        }
    }

    class ArvoreBinaria {
        No raiz;

        ArvoreBinaria() {
            raiz = null;
        }

        void inserir(int valor) {
            raiz = inserirRecuro(raiz ,valor);
        }

        No inserirRecuro(No no, int valor) {
            if (no == null) {
                no = new No(valor);
                return no;
            }
            if (valor < no.valor) {
                no.esquerda = inserirRecuro(no.esquerda, valor);
                
            }else if (valor > no.valor) {
                no.direita = inserirRecuro(no.direita, valor);
            }

            return no;
        }

        void ordem() {
            ordemRecursos(raiz);
        }

        void ordemRecursos(No no) {
            if (no != null) {
                ordemRecursos(no.esquerda);
                System.out.println(no.valor + " ");
                ordemRecursos(no.direita );
                
            }

        }


    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
       
        arvore.inserir(10);
        arvore.inserir(30);
        arvore.inserir(40);
        arvore.inserir(20);
      
        arvore.ordemRecursos(null);
       
        System.out.println("Percurso em ordem: ");
     ;


     }

 }

