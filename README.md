# Report del Progetto di Testing

Questo progetto utilizza **GitHub Actions** per automatizzare le seguenti attività:
- l’esecuzione dei test unitari  
- il calcolo della **code coverage** tramite *JaCoCo*  
- l’analisi dei **Test Smells** mediante *TestSmellDetector*

È stata implementata una soluzione **scalabile rispetto all’aumento del numero di classi di test analizzate**.

> **Attenzione!:** Sebbene la soluzione sia progettata per supportare un incremento del numero di classi di test, non è pensata per scenari con un numero estremamente elevato di file di test, in quanto alcune fasi del workflow (come la normalizzazione dei file e l’analisi dei Test Smells) potrebbero introdurre un overhead significativo.

---

## Confronto tra caso base e soluzione scalabile

Per valutare l’impatto della scalabilità, si è deciso di mantenere anche l’analisi del **caso base**, costituito da una singola classe di test.  
Il workflow relativo a questo caso è attualmente **disabilitato**, ma i risultati sono riportati a fini comparativi.

Il workflow **“CI Scalability - Coverage & Smells”** estende la soluzione di base introducendo alcuni accorgimenti fondamentali, tra cui:
- la **normalizzazione dei nomi dei file e delle classi di test**, necessaria per garantire la corretta esecuzione dei test;
- l’analisi cumulativa di più classi di test;

---

## Osservazioni sui risultati

All’aumentare del numero di classi di test analizzate, si è osservato un **incremento della code coverage complessiva**, che è passata dal **91% nel caso base** al **93% nella soluzione scalabile**.

Tuttavia, durante l’esecuzione dei diversi casi di test, sono stati riscontrati **numerosi fallimenti di test** all’interno di alcune delle classi di test esaminate.  
Questo evidenzia come l’aumento della coverage non implichi necessariamente una maggiore stabilità o correttezza dei test, ma possa invece portare alla luce **criticità precedentemente non individuate** quando si analizza una singola classe di test.

---

## 📈 Risultati

Di seguito sono riportati i risultati ottenuti dall’analisi di più classi di test.

<!-- BASE_SMELLS_START -->
<!-- BASE_SMELLS_END -->

### 1. Code Coverage (Soluzione Scalabile)
La seguente metrica indica la percentuale di codice coperta dai test nella configurazione scalabile:

![Coverage](HSLColor_Tests/badges/jacoco_scalability.svg)
![Branches](HSLColor_Tests/badges/branches_scalability.svg)

---

### 2. Test Smells (Soluzione Scalabile)
Di seguito sono riportati i risultati dell’analisi dei **Test Smells** effettuata tramite **TestSmellDetector**.  
I risultati sono organizzati in modo tale che, per ogni file di test analizzato, vengano elencati i Test Smells individuati.

📂 **[Scarica il Report dei Test Smells (CSV)](HSLColor_Tests/smells_report.csv)**

---

## Caso Base

Di seguito sono riportati i risultati dell’analisi dei Test Smells relativi al singolo file di test **`TestHSLColor.java`**.

### 1. Code Coverage (Caso Base)

![Coverage](HSLColor_Tests/badges/jacoco_base.svg)
![Branches](HSLColor_Tests/badges/branches_base.svg)

---

### 2. Test Smells (Caso Base)
📂 **[Scarica il Report Base (CSV)](HSLColor_Tests/smells_base.csv)**

---

## Considerazioni finali

In conclusione, la soluzione scalabile consente di analizzare più classi di test in modo automatizzato, migliorando la copertura del codice e rendendo più evidenti eventuali problemi di qualità dei test, come fallimenti e Test Smells, che potrebbero non emergere in un’analisi limitata a un singolo file.
