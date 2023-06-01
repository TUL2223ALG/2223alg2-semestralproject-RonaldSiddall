# Semestrální práce - ALG2 - Ronald Ch. Siddall, AVI FM TUL
## Motivace projektu
Chtěl jsem svoji semestrální práci zaměřit na něco, co mi je velmi blízké a čemu se rád věnuji ve svém volném čase. Je to stolní tenis; poslední koníček a sport, který mi “přetrval” z dětství a kterému se mohu plně věnovat i nýnější době, během studia na univerzitě. 
Stolní tenis je velmi komplexní hra, která je běžným člověkem mnohdy nepochopená. Komplexnost hry je v mnoha směrech - psychika, technika, načasování, teorie potahů, dřev a míčků, různé typy úderů a mnoho dalších specifik, které z tohoto sportu činí celoživotní (a to doslova) zálibu a koníček!

Každopádně velkým problémem, na který jsem sám v průběhu hraní stolního tenisu narazil je, že není žádný jednoduchý způsob, jak zjistit, jak se mi může vyvíjet moje konkrétní bodové ohodnocení ELO podle toho, jestli vyhraju/prohraju proti určitému hráči.
Toto je hlavní myšlenka projektu a hlavní věc, kterou můj program řeší, ale o tom více níže.

## Popis problému
Na oficiálních stránkách STIS jsou dostupné žebříčky a soupisky všech dosavadních týmů a hráčů, kteří v ČR hrají. Žebříčky ve stolním tenise fungují na bázi hodnocení na principu ELO, což je způsob, jak se hodnotí výkonnost každého individuálního hráče - zjednodušeně hráč s vyšším ELO získá méně bodů, pokud porazí hráče s nižším ELO a hráč s nižším ELO ztratí méně bodů, když prohraje s hráčem, který má vyšší ELO.
Takhle to funguje i v opačném případě, kdy hráč s nižším ELO vyhraje proti hráči s vyšším ELO, tak získá mnohem víc bodů. Můj program pracuje s reálnými soupiskami všech týmů a jejich hráči v rámci dané soutěže.
Program by poté pracoval s žebříčky soutěže tzn. umístění všech hráčů podle zmiňovaného ELO hodnocení. Na základě informací z žebříčku by program dokázal spočítat, jak by se odvíjelo ELO obou hráčů, kdyby spolu teoreticky hráli zápas.
Program by znal jejich ELO (ze žebříčku) a podle toho by dokázal vyhodnotit, kolik ELO bodů by každý hráč získal/ztratil v případě výhry/prohry. Takto by se daly předpovídat ELO zisky/ztráty pro nadcházející soutěže a hráči by měli jednoduchý způsob, jak si tuto předpověď zjistit.

Mimo jiné program dokáže zobrazit informace konkrétního hráče, týmu, soutěžě aj., kromě toho umí zobrazit seřazené soupisky hráčů, týmů seřazených podle úspěšnosti, počtu bodů atd. a mnoho dalšího.

## Řešení problému a provedení projektu
### Funkční specifikace - popis fungování programu z pohledu uživatele
Uživatel má na výběr tyto metody a funkce. Jedná se o několika úrovňové menu, kterým může uživatel volně pohybovat pomocí kláves:

![MethodAndFunctionDiagramALG2_page-0001](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/f32e178d-00e5-4a6f-b21b-a75af8c11341)

### Struktura vstupních a výstupních souborů
#### Vstupní soubory - zdrojová data
Program pracuje s reálnými daty staženými z oficiální stránky českého stolního tenisu STIS. Tam jsou všechny žebříčky a informace k soutěžím, hráčům a týmům dostupné volně ke stažení ve formátu .csv, které jsou v otevírány v programu EXCEL. Program nedokáže pracovat s tímto souborem (v excelu), a proto je nutné, aby uživatel stažený soubor uložil v Excelu znovu, ale jako soubor CSV UTF-8 (s oddělovači) .csv.
Pokud se jedná o relevantní soubor a uživatel správně tento soubor uloží, tak program následně dokáže pracovat s libovolnými soutěžemi a žebříčky, které se v rámci STIS nachází.
#### Výstupní soubory
Pokud uživatel zvolí volbu, že si chce uložit výsledky teoretického nasimulovaného zápasu do souboru, tak má na výběr ze dvou možností: buď do textového či binárního souboru. Oba tyto soubory poté obsahují kompletní teoretický rozbor konkrétního zápasu včetně informací o tom, co každá informace znamená.

### Class diagram (rozvržení tříd) projektu
Takto vypadá můj projekt rozvržený do tříd:

![ClassDiagramALG2_page-0001](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/3cd9049b-df42-4248-a78e-24a4f68c9760)

##
