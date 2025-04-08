#include <stdio.h>
#include <stdlib.h> // Per atof e system("pause") su Windows

int main() {
    char valore_input[50]; // Variabile per memorizzare l'input dell'utente
    printf("Inserisci un valore numerico per ottenere il quadrato oppure 'f' per terminare:\n");
    
    while (1) {
        printf("Inserisci un valore: ");
        scanf("%s", valore_input);
        
        if (valore_input[0] == 'f' || valore_input[0] == 'F') {
            printf("Programma terminato.\n");
            break;
        }
        
        char *indicatore_conversione;
        double numero = strtod(valore_input, &indicatore_conversione);
        
        if (*indicatore_conversione == '\0') { // Controlla se la conversione è riuscita completamente
            printf("Il quadrato di %.2f è: %.2f\n", numero, numero * numero);
        } else {
            printf("Input non valido. Inserisci un numero o 'f' per uscire.\n");
        }
    }
    
    return 0;
}
