package com.example.nihad.booksapp;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.view.ViewPager;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewTreeObserver;

import com.google.gson.Gson;

import java.util.LinkedHashMap;

/**
 * Created by nihad on 27/01/2018.
 */

public class BookLoader {
    DbHelper dbHelper;

    public BookLoader(Context context) {
        this.dbHelper = new DbHelper(context);
    }

    public void insertData() {

        if (dbHelper.isDatabaseEmpty()) {

            dbHelper.insertChapterData("Uvod", "U ime Allaha, Milostivog, Samilosnog!\n" +
                    "\n" +
                    "Hvala pripada Allahu,Gospodaru svjetova. Neka su\n" +
                    "mir i spas Resulullahu, sallallahu alejhi ve sellem,\n" +
                    "njegovoj časnoj porodici, ashabima i svim vjerni" +
                    "cima.\n" +
                    "\n" +
                    "Općenito uzevši, u pisanju su draž i užitak, ali i\n" +
                    "napor te stanovita poteškoća, jer čovjeku ponekad\n" +
                    "dođe inspiracija u bilo koje vrijeme, pa i noću, pa\n" +
                    "napiše nekoliko stranica, a katkad mu inspiracija\n" +
                    "uopće ne dolazi, i tad je teže napisati samo jednu\n" +
                    "rečenicu nego kutnjak izvaditi, kako je to govorio\n" +
                    "el Ferezdek. Budući da je to tako, shvatio sam da se\n" +
                    "nalazim pred surovim izborom: ili ću se prihvati" +
                    "ti pera i pisati, podnoseći sve napore koje pisanje\n" +
                    "iziskuje, ili ću pero odložiti i prepustiti se stihiji.\n" +
                    "Zbog toga sam krenuo središnjim putem i počeo\n" +
                    "bilježiti određene dojmove i zapažanja u vezi s pi" +
                    "tanjima koja ne zahtijevaju da im se čovjek odveć\n" +
                    "posveti i koja ne iziskuju da u njih uloži mnogo tru" +
                    "da. Eto, tako je nastala ova knjiga.\n" +
                    "\n" +
                    "Ovakav pristup pisanju knjige lakši je piscu, a či" +
                    "taocima je, tako napisana, knjiga pitkij a. Mnogi pri" +
                    "jašnji učenjaci i muhadisi izabrali su upravo ovaj\n" +
                    "\n" +
                    "način pisanja djela: Ibn Hazm u el Ahláku ves sije" +
                    "ru, Ibn Akil u el Fum'mu, Ibnul Dževzi u Sajdul há" +
                    "tim, Ibnul Kajjim u el Feváidu, Muhammed Kurd\n" +
                    "Alija...\n" +
                    "\n" +
                    "Tu su i mnogi zapadni autori i književnici koji\n" +
                    "su se koristili ovim načinom pisanja, a koji su iza\n" +
                    "sebe ostavili vrijedna, predivna, veličanstvena dje" +
                    "la. Štaviše, neka od tih djela postala su bestseleri.\n" +
                    "\n" +
                    "Zapažanja koja čine ovu knjigu nisu istovjetne\n" +
                    "dužine, a ona se odnose ili na neki kur*anski ajet, ili\n" +
                    "na neki Poslanikov, sallallahu alejhi ve sellem, ha" +
                    "dis, ili na historijski događaj, ili na poslovicu, ili na\n" +
                    "neku situaciju... Negdje ću navesti misao koju ću\n" +
                    "na drugom mjestu objasniti, i obratno. Želim pod" +
                    "sjetiti i na to da se piscu može dogoditi da zabilježi\n" +
                    "misao, shvatanje ili ideju, te da pomisli da niko pri" +
                    "je njega to nije rekao.\n" +
                    "\n" +
                    "Čitaoče, sadržaj knjige koja se nalazi u tvojim ru" +
                    "kama nastao je u različitim okolnostima, vremeni" +
                    "ma i godišnjim dobima: na putu i kod kuće, noću i\n" +
                    "danju, zimi i ljeti... Neki su mi prijatelji predložili\n" +
                    "da ovu knjigu, pošto je završim, objavim tek nakon\n" +
                    "što prođe godinu dana, četiri godišnja doba.\n" +
                    "\n" +
                    "Ne znajući da će zapažanja i dojmovi koje sam\n" +
                    "bilježio biti štampani kao knjiga, nisam zapisivao\n" +
                    "datum u kojem su oni nastali. Kamo sreće da sam\n" +
                    "to činio! Sve u svemu, ovaj je materijal nastao u pe" +
                    "riodu od 1417. do 1428. godine po Hidžri; većinu " +
                    "sam zapažanja zabilježio od 1426. do 1428. godine\n" +
                    "po Hidžri.\n" +
                    "\n" +
                    "Sad, kad, evo, odlažem pero, ne mogu a da se ne\n" +
                    "zahvalim svima onima koji su mi na bilo koji način,\n" +
                    "kao, naprimjer, prijedlozima i ispravkama, pomo" +
                    "gli u ovom poslu, moleći Gospodara svjetova da ih\n" +
                    "obilno nagradi. Allah je jedini Bog i samo se na Nje" +
                    "ga oslanjam!", "Vodič kroz život");

            dbHelper.insertChapterData("MUDRI SAVJETI", "1. Čovjek se ne treba uznemiriti ako ga dobronamjeran savjetnik ukori zbog greške.\n" +
                    "\n" +
                    "2. Kušnje jačaju čovjeka, i zato ih treba izdržati, a čovjek ne smije dozvoliti da ga one unište.\n" +
                    "\n" +
                    "3. Vrijednost se očituje u sputavanju bolesnih strasti i sustezanju od onog što ne valja.\n" +
                    "\n" +
                    "4. I ti ćeš biti stradalnik ako budeš preuveličavao problem i pojave doživljavao negativno.\n" +
                    "\n" +
                    "5. Nemoj odbaciti onog prema kome osjećaš makar malo ljubavi!\n" +
                    "\n" +
                    "6. Nastoj što prije početi s činjenjem nečeg što je dobro, ali nemoj žuriti dok se baviš tim poslom!\n" +
                    "\n" +
                    "7. Ne iznosi svoj stav glede nekog pitanja ili pojave pred onim čiji stav ne znaš, sve dok se ne uvjeriš da te isti taj čovjek neće napasti zbog tvog stava!\n" +
                    "\n" +
                    "8. Nemoj dozvoliti da se prepadneš snage onih što remete red na Zemlji! Njihova će rabota propasti jer Allah, džellešanuhu, ne dozvoljava da uspiju oni koji nered čine.\n" +
                    "\n" +
                    "9. U ljutnji nemoj ništa govoriti i nemoj ništa predlagati jer ćeš, možda, pogrešno prosuditi!\n" +
                    "\n" +
                    "10. Ne prihvataj svaku misao kad si umoran jer umor može dovesti do neispravnog razmišljanja!\n" +
                    "\n" +
                    "11. Ljudi se dijele na dvije kategorije, a to su odrasla djeca i odrasli koji su ostali djeca.\n" +
                    "\n" +
                    "12. Nemoj uputiti prijekor nikom zbog djela koje bi i sam u sličnim okolnostima učinio!\n" +
                    "\n" +
                    "13. Sto puta se čovjek pokaje za ono što rekne ili uradi, rijetko za ono što prešuti ili ne uradi.\n" +
                    "\n" +
                    "14. Nije problem u tome da ti neko učini nažao, upravo je problem u tome kako ćeš primiti i doživjeti njegovu nepravdu.\n" +
                    "\n" +
                    "15. Neprihvatanje savjeta i nipodaštavanje savjetnika pokazatelj je kratke pameti i razlog ustrajavanja u grešci.\n" +
                    "\n" +
                    "16. Priznaj grešku kad pogriješiš i primi dobronamjeran savjet, bit ćeš cijenjen u društvu, a nećeš ponavljati greške.\n" +
                    "\n" +
                    "17. U teškoći i nedaći traži utjehu u iskrenoj dovi, pa će ti se Allah, Gospodar svjetova, odazvati; neće te pratiti osjećaj usamljenosti i zbunjenosti.\n" +
                    "\n" +
                    "18. Razmišljanje o posljedicama potaknut će razumnog čovjeka na smjelo pristupanje nekom poslu ili će ga ono od tog posla odvratiti.\n" +
                    "\n" +
                    "19. Imaj na umu da se ljudi dijele na tri kategorije: oni koji sami sebi čine nepravdu griješeći, oni koji su umjereni i oni koji druge pretiču u činjenju dobra. Zato se ne opterećuj teženjem ka savršenstvu, znaj da je savršenstvo teško postići!\n" +
                    "\n" +
                    "20. Čini dobra djela i nemoj kazati da njihove plodove još nisi vidio! Dobro djelo, uz Allahovu volju, neizostavno daje plodove!\n" +
                    "\n" +
                    "21. Nemoj izgubiti samopouzdanje ako te ljudi ne cijene onoliko koliko bi to trebali, ali nemoj se ni precijeniti ako te ljudi neumjereno hvale!\n" +
                    "\n" +
                    "22. Raduj se dobronamjernoj kritici kao što se raduješ iskrenoj pohvali!\n" +
                    "\n" +
                    "23. Plemenita djela, hvale dostojan trud i lijepo ponašanje jesu čovjekovi branioci koji negiraju sve negativnosti koje se o njemu govore.\n" +
                    "\n" +
                    "24. Ljudi se dive velikanima i vole plemenitost, ali se malo ljudi povodi za velikanima i teži plemenitim podvizima.\n" +
                    "\n" +
                    "25. Velikan je skroman, a većinom su oholi oni što se s njime druže.\n" +
                    "\n" +
                    "26. Prema onom ko ti učini nažao ophodi se u skladu sa svojim ponosom i lijepim ponašanjem, a ne u skladu s njegovim zaslugama! Postupiš li tako, za voljet će te i neprijatelji, a trajno ćeš očuvati prijateljske veze.\n" +
                    "\n" +
                    "27. Kad nekom djelu pristupiš s iskrenom namjerom i učiniš ga najbolje što možeš, nemoj se osvrtati na nepravedne kritike! Nedostatak je u kritičaru, nije u tebi.\n" +
                    "\n" +
                    "28. Kad čovjek svoje srce ispuni ljubavlju prema Allahu, strahom od kazne i nadom u lijep ishod na ahiretu, u srcu nema mjesta za ljubav prema bilo kome drugom, niti za strah od bilo koga drugog, niti za nadu u nekog drugog, a ne u Allaha. Ako čovjek iskreno robuje Uzvišenom Allahu, oslobodio se robovanja bilo kome drugom.\n" +
                    "\n" +
                    "29. Ako si uvjeren u to da rasprava nema pozitivnu posljedicu, sustegni se od nje.\n" +
                    "\n" +
                    "30. Odmaraj se od poslova prije nego što te obaveze i umor sasvim iscrpe.\n" +
                    "\n" +
                    "31. Ako te zadesi kakva nesreća, očekuj da će ti Sveznajući Allah ukazati na izlaz! Uz poteškoću uvijek ide i last, a jedna nesreća ne može nadvladati dvostruko olakšanje, kao što se kaže u suri el Inširah.\n" +
                    "\n" +
                    "32. Nemoj se čuditi da postoje i oni ljudi koji su škrti i nemoj biti jedan od onih što se žale na njihovu škrtost!\n" +
                    "\n" +
                    "33. Čovjekova ćud ne dolazi do izražaja onda kad posluje s moćnima i uglednima — možda je prisiljen na lijepo ponašanje i laskanje, nego njegova ćud dolazi do izražaja onda kad posluje s onima koji su manje moćni i manje ugledni od njega.\n" +
                    "\n" +
                    "34. Priznat ćeš veličinu onom ko se spusti na tvoj stepen, pa znaj da će tvoju veličinu priznati onaj ko tebi nije ravan ako se ti spustiš na njegov stepen.\n" +
                    "\n" +
                    "35. Lijepo je da se čovjek izvini zbog greške, ajošje ljepše da ne pogriješi. Čuvaj se svega onog zbog čega ćeš se nekom morati izviniti!\n" +
                    "\n" +
                    "36. Budi dobrodušan i dobronamjeran, nemoj biti izopačen i zlonamjeran.\n" +
                    "\n" +
                    "\n" +
                    "\n", "Vodič kroz život");

            dbHelper.insertChapterData("Ne satiri svoju dušu žalosteći se", "Dugo sam razmišljao o Allahovim riječima: \"...pa ne izgaraj od žalosti za njima...\" (Fatir, 8) i zaključio da one sadrže lijek za mnoge neprijatnosti i probleme u životu. Naći ćeš da neki ljudi teže popravljanju ponašanja onih koji podbacuju u izvršavanju dužnosti, ličnom napretku, upućivanju zalutalog, podnošenju ponašanja nerazumna druga, upućivanju savjeta neposlušnom djetetu, uspostavljanju prijateljske veze s onim koji to ne želi, animiranju lijenog učenika i tako redom, ulažu trud i upinju se, a ako u svojoj namjeri ne uspiju, tuguju, jadikuju i satiru svoju dušu žalosteći se. Doduše, ima i onih koji će se posavjetovati s iskusnima, te će im ovi preporučiti da poduzmu sve potrebne mjere i da svoju energiju usmjere u ispravnom pravcu, na šta će neuspješni reći da su sve poduzeli, ali, eto, nisu uspjeli. Tuga i depresija imaju za posljedicu nerazumno ponašanje koje naposlijetku može dovesti do gubljenja želje za činjenjem drugih, raznovrsnih dobrih djela. Neće imati snage za činjenje dobra onaj ko pretjerano razmišlja o nečemu što ga zaokuplja, a što je odveć beskorisno.\n" +
                            "\n" +
                            "Pa u čemu je onda rješenje ovog problema? Hoće li čovjek šutjeti snužden i nemoćan? Treba li se predati tugovanju? Ne, neće se predati očaju ni tugovanju, neće biti snužden i neće se osjećati nemoćnim, nego će smatrati daje svoj posao besprijekorno obavio i da će ga Plemeniti Allah, Gospodar svjetova, nagraditi za dobročinstvo. K tome, živjet će kao što je i dotad živio i nastojat će činiti dobro.\n" +
                            "\n" +
                            "Čitaoče, kad uputiš nekom mudar i umilan savjet, pritom se maksimalno trudeći da popraviš njegovo ponašanje, ali ne uspiješ u tome, sjeti se Božijih riječi: \"I ne tuguj za njima, i neka ti nije teško zbog spletkarenja njihova. Allah je zaista na strani onih koji se Njega boje i grijeha klone i koji dobra djela čine\" (en Nahl, 127, 128), \"...pa ne izgaraj od žalosti za njima...\" (Fatir, 8)",
                    "Vodič kroz život");

            dbHelper.insertChapterData("Kako treba razumjeti izjave ispravnih prethodnika?", "",
                    "Vodič kroz život");
        }

    }

}
