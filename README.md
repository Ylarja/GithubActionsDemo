# Report del Progetto di Testing

Questo progetto utilizza **GitHub Actions** per automatizzare:
- l’esecuzione dei test unitari
- il calcolo della **code coverage**
- l’analisi dei **Test Smells** tramite *TestSmellDetector*

L’obiettivo è valutare **la scalabilità della pipeline di testing** all’aumentare del numero di classi di test.

---

## 📊 Analisi Baseline (1 classe di test)

Questa sezione rappresenta la **baseline**, ottenuta eseguendo **una sola classe di test** (`TestHSLColor.java`).

<!-- BASELINE_SMELLS_START -->
<!-- BASELINE_SMELLS_END -->

### 1. Code Coverage (Baseline)
La seguente metrica indica la percentuale di codice coperta dal **solo test baseline**.

![Coverage](HSLColor_Tests/badges/jacoco.svg)
![Branches](HSLColor_Tests/badges/branches.svg)

### 2. Test Smells (Baseline)
Risultati dell’analisi dei Test Smell sul singolo file di test tramite **TestSmellDetector**.

📂 **[Scarica il Report Baseline (CSV)](HSLColor_Tests/smells_baseline.csv)**

---

## 📈 Analisi di Scalabilità (più classi di test)

Questa configurazione valuta la pipeline con **più classi di test** (baseline + test di altri studenti),
al fine di verificare il comportamento della soluzione all’aumentare del numero di test.

<!-- SCALABILITY_SMELLS_START -->
<!-- SCALABILITY_SMELLS_END -->

📂 **[Scarica il Report Scalabilità (CSV)](HSLColor_Tests/smells_report.csv)**

---

## 🧪 Valutazione della Scalabilità

Dal confronto tra le due configurazioni emerge che:

- la **code coverage** aumenta in modo cumulativo con l’aggiunta di nuove classi di test
- il numero di **Test Smells rilevati** cresce proporzionalmente al numero di test analizzati
- la pipeline CI/CD **non richiede modifiche strutturali** per supportare nuovi test

La soluzione risulta quindi **scalabile, automatizzata e riutilizzabile** anche in presenza di un numero maggiore di classi di test.

---

*Report generato automaticamente da GitHub Actions su Ubuntu-Latest.*
