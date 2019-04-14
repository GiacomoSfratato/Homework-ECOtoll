# Homework-ECOtoll
Si vuole progettare un insieme di classi Java che consentano la **gestione dei pedaggi presso
caselli autostradali.**
La formula per il calcolo del pedaggio può essere riprodotta simulando (in maniera semplificata) un
sistema chiuso che tiene conto dei seguenti elementi:
1. **Tariffa unitaria**: La tariffa unitaria viene moltiplicata per i km.
2. **Arrotondamento**: All’importo ottenuto al punto 1, si aggiunge l'Iva (22%, ma può variare).
Poi, si applica l'arrotondamento, per eccesso o per difetto, ai 10 centesimi di euro.
3. **Classe veicolo**: La tariffa unitaria dipende dal tipo di veicolo utilizzato (5 classi).  

Si vuole progettare un sistema di classi e interfacce Java che gestiscono tale sistema e che
**calcolino il pedaggio in base a veicolo e percorso.** Si deve far uso di ereditarietà, interfacce,
costruttori e uso opportuno di membri delle classi.
