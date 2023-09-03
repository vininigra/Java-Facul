#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;
int menu(){
	int a;
	
	cout << "Escolha um:" << endl;
    cout << "1 - Lagarto" << endl;
    cout << "2 - Papel" << endl;
    cout << "3 - Tesoura" << endl;
    cout << "4 - Spock" << endl;
    cout << "5 - Pedra" << endl;
    cout << "6 - Sair "<<endl;
    
    cin >> a;

    return a;
	
}

int main() {
	int opcaoEscolhida;
	opcaoEscolhida = menu();
    int teste;
    
    srand(time(NULL));

    teste = rand() % 5 + 1;

   

	
	
	    switch (opcaoEscolhida) {
	        case 1:
	            if (teste == 1){
	                cout << "Empatou! Escolheram o mesmo" << endl;
	            }else if(teste == 2){
	            	cout << "Ganhou! Lagarto come papel" << endl;
				}else if(teste == 3){
					cout << "Perdeu! Mata Lagarto" << endl;
				}else if(teste == 4){
					cout << "Ganhou! Spock tem medo de largarto " << endl;
				}else if(teste == 5){
					cout << "Perdeu! Pedra mata lagarto" << endl;
				}
	            break;
	
	        case 2:
	             if (teste == 2){
	                cout << "Empatou! Escolheram o mesmo" << endl;
	            }else if(teste == 1){
	            	cout << "Perdeu! Lagarto come papel" << endl;
				}else if(teste == 3){
					cout << "Perdeu! Tesoura corta papel" << endl;
				}else if(teste == 4){
					cout << "Ganhou! Spock perde para papel " << endl;
				}else if(teste == 5){
					cout << "Ganhou! Papel emprulha pedra" << endl;
				}
	            break;
	
	        case 3:
	             if (teste == 3){
	                cout << "Empatou! Escolheram o mesmo" << endl;
	            }else if(teste == 1){
	            	cout << "Ganhou! Lagarto morre para tesoura" << endl;
				}else if(teste == 2){
					cout << "Ganhou! Tesoura corta papel" << endl;
				}else if(teste == 4){
					cout << "Perdeu! Spock derrete tesoura " << endl;
				}else if(teste == 5){
					cout << "Perdeu! Pedra quebra tesoura" << endl;
				}
	            break;
	
	        case 4:
	            if (teste == 4){
	                cout << "Empatou! Escolheram o mesmo" << endl;
	            }else if(teste == 2){
	            	cout << "Perdeu! Papel engole spock" << endl;
				}else if(teste == 3){
					cout << "Ganhou! Spock Derrete tesoura" << endl;
				}else if(teste == 1){
					cout << "Perdeu! Spock tem medo de lagarto " << endl;
				}else if(teste == 5){
					cout << "Ganhou! Spock quebra pedra" << endl;
				}
	            break;
	
	        case 5:
	             if (teste == 5){
	                cout << "Empatou! Escolheram o mesmo" << endl;
	            }else if(teste == 2){
	            	cout << "Perdeu! Papel embrulha pedra" << endl;
				}else if(teste == 3){
					cout << "Ganhou! Pedra quebra tesoura" << endl;
				}else if(teste == 4){
					cout << "Perdeu! Spock derrete tesoura " << endl;
				}else if(teste == 1){
					cout << "Ganhou! Pedra mata Lagarto" << endl;
				}
	            break;
	    }
	
    return 0;
}

