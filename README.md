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

### 1. Code Coverage (Baseline)
![Coverage](HSLColor_Tests/badges/jacoco_baseline.svg)
![Branches](HSLColor_Tests/badges/branches_baseline.svg)

### 2. Test Smells (Baseline)
Risultati dell’analisi dei Test Smell sul singolo file di test tramite **TestSmellDetector**.

📂 **[Scarica il Report Baseline (CSV)](HSLColor_Tests/smells_baseline.csv)**

---

## 📈 Analisi di Scalabilità (più classi di test)

### 1. Code Coverage (Scalability)
La seguente metrica indica la percentuale di codice coperta dal **solo test scalability**.

![Coverage](HSLColor_Tests/badges/jacoco_scalability.svg)
![Branches](HSLColor_Tests/badges/branches_scalability.svg)

### 2. Test Smells (Scalability)
Risultati dell’analisi dei Test Smell sul singolo file di test tramite **TestSmellDetector**.

📂 **[Scarica il Report Smells (CSV)](HSLColor_Tests/smells_report.csv)**

---

