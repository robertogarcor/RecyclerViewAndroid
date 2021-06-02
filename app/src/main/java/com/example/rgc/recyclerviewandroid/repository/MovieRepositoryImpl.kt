package com.example.rgc.recyclerviewandroid.repository

import com.example.rgc.recyclerviewandroid.datasource.Movie

class MovieRepositoryImpl : MovieRepository {

    private val dataSource : MutableList<Movie> = ArrayList<Movie>()

    init {
        dataSource.add(Movie("Aquellos que desean mi muerte","Suspense","01h40min","El único testigo de un asesinato, un adolescente, es perseguido por dos asesinos, que son gemelos, a través de las tierras del estado de Montana. El joven está acompañado de un experto en supervivencia que le ayudará en huir de esta cacería, pero un incendio en una zona cercana amenaza las vidas de todos ellos.","http://es.web.img2.acsta.net/pictures/21/04/27/15/37/5016956.jpg"))
        dataSource.add(Movie("Nadie (Nobody)","Acción","01h32min", "Cuando unos ladrones asaltan su hogar, Hutch Mansell, el padre de familia, toma una actitud completamente pasiva y no defiende a sus seres queridos para evitar que haya violencia. Impulsado por la rabia, comienza un camino autodestructivo en el que descubrirá habilidades de combate que ni él mismo era consciente que poseía.", "http://es.web.img2.acsta.net/pictures/20/12/15/11/11/4656694.jpg"))
        dataSource.add(Movie("El Señor de los Anillos: El retorno del Rey","Fantasia","03h21min","El ejército de Sauron ha atacado Minas Tirith, la capital de Gondor. Una poderosa amenaza pone en peligro la paz del reino, antaño poderoso y que ahora necesita más que nunca a su rey. Ante esta situación límite, Aragorn se presenta como una figura clave para llevar al reino a la victoria pero, ¿será...?","http://es.web.img2.acsta.net/medias/nmedia/18/89/68/19/20061877.jpg"))
        dataSource.add(Movie("Chaos Walking","Ciencia ficción","01h49min","La acción sigue a Todd (Tom Holland), un joven que se ha criado en Prentisstown. Durante toda su vida ha crecido creyendo que la \"Masilla\" fue la autora de que todas las mujeres desaparecieran debido a la liberación de un germen, mientras que los hombres eran contagiados por el Ruido. Todo esto está a punto de cambiar con la llegada de Viola (Daisy Ridley), una mujer que acaba de aterrizar en un territorio únicamente habitado por hombres. Pero Viola no ha venido sola. La joven está a punto de avisarles de la inminente amenaza que está a punto de llegar a este planeta.","http://es.web.img2.acsta.net/pictures/20/11/13/15/54/0111059.jpg"))
        dataSource.add(Movie("Tiburón blanco","Acción","01h41min","Lo que parecía una excursión fantástica en un hidroavión, rápidamente se convirtió en la peor pesadilla de sus cinco pasajeros al quedarse varados en medio del océano a kilómetros de la costa. Ahora, el grupo tratará desesperadamente de sobrevivir intentando llegar a tierra antes de que se terminen los suministros y los víveres con los que cuentan o de ser capturados por los tiburones que se encuentran debajo de su embarcación.","http://es.web.img1.acsta.net/pictures/18/06/11/12/39/2719882.jpg"))
        dataSource.add(Movie("Godzilla vs Kong","Acción", "01h54min", "Con el mundo todavía sacudido por la batalla entre Ghidorah y Godzilla, la humanidad ha comenzado a intentar coexistir con los Titanes. Pero después de que Godzilla comience su propio reinado de terror, los gobiernos deben recurrir a otra leyenda para detenerlo: King Kong. No será tan fácil cuando la compañía Monarch viaja a Skull Island, donde una misteriosa joven conocida por comunicarse con el gigantesco monstruo le advertirá del peligro inminente.", "http://es.web.img2.acsta.net/pictures/21/03/15/18/35/3097205.jpg"))
        dataSource.add(Movie("¡Upsss 2! ¿Y ahora dónde está Noé?","Animación","01h26min", "Finny y Leah se caen del arca que les iba a salvar del fin del mundo. La fuerte tormenta les hará separarse, teniendo destinos muy diferentes. Pese a todo, harán lo posible por volver a reencontrarse y salvarse mutuamente una vez más.", "http://es.web.img3.acsta.net/pictures/20/12/22/18/16/0531955.jpg"))
        dataSource.add(Movie("Mortal Kombat","Acción","01h50min","Mortal Kombat es la nueva adaptación cinematográfica de la famosa saga de videojuegos. La acción sigue a Cole Young, un luchador de MMA acostumbrado a pelear a cambio de dinero, y quien desconoce su importante ascendencia y la valiosa herencia que está a punto de recibir. Este hecho hará que el emperador Shang Tsung de Outworld envía a su letal guerrero Sub-Zero, un criomante capaz de controlar el hielo para darle caza. El protagonista deberá embarcarse en un peligroso viaje y búsqueda de aliados para proteger a su familia.","http://es.web.img2.acsta.net/pictures/21/03/30/16/14/5223967.jpg"))
        dataSource.add(Movie("Wonder Woman 1984","Acción","02h31min","Esta continuación de la película Wonder Woman (2017) sobre la superheroína de DC Comics, nos sitúa en los años 80. Cuando de forma sorprendente e inesperada Steve Trevor (Chris Pine) vuelva a la vida, Diana Prince (Gal Gadot) se verá envuelta en un enfrentamiento contra la peligrosa villana Cheetah (Kristen Wiig).","http://es.web.img1.acsta.net/pictures/20/12/23/12/39/0017180.jpg"))
        dataSource.add(Movie("Raya y el último dragón","Animación","01h47min","Ambientada en el sudeste asiático, la cinta sigue la historia de Raya, una niña de espíritu aventurero que vive en un reino llamado Kumandra. Este lejano territorio está habitado por una civilización milenaria. Cinco son los clanes que forman esta tierra y Raya será la encargada de encontrar al último de ellos en la mayor aventura de su vida.","http://es.web.img1.acsta.net/pictures/21/02/24/11/45/0895010.jpg"))
        dataSource.add(Movie("Los Croods: Una nueva era","Animación","01h36min","La pintoresca familia prehistórica de Los Croods vuelve a hacer de las suyas. Este divertido clan formado por la joven e inquieta Eep, su gruñón padre Grug, su comprensiva aunque despistada madre Ugga, además del friki Thunk y la bebé Sandi, regresan a la gran pantalla en una nueva aventura troglodítica.","http://es.web.img1.acsta.net/pictures/20/09/22/10/55/0339841.jpg"))
        dataSource.add(Movie("Ruega por nosotros","Terror","01h40min","Un periodista acabado descubre una serie de milagros aparentemente divinos en una pequeña ciudad de Nueva Inglaterra. Resulta que allí, una muchacha parece haber obtenido ciertos poderes sobrenaturales tras una supuesta aparición de la Virgen María. Tras conseguir que un periódico le haga cargo del trabajo, decide viajar allí para usar la exclusiva con la intención de resucitar su carrera. Sin embargo, eso hechos inexplicables pueden tener una fuente mucho más oscura.","http://es.web.img3.acsta.net/pictures/21/03/17/13/18/1808324.jpg"))
        dataSource.add(Movie("El Señor de los Anillos: Las dos torres","Fantasia","02h59min","Tras la muerte de Boromir y la desaparición de Gandalf, la Comunidad se divide en tres. Perdidos en las colinas de Emyn Muil, Frodo y Sam descubren que les persigue Gollum, una criatura volátil corrompida por el Anillo Único. Éste promete a los hobbits conducirles hasta la Puerta Negra de Mordor. Aragorn...","http://es.web.img1.acsta.net/medias/nmedia/18/89/85/69/20070008.jpg"))
        dataSource.add(Movie("Final Fantasy, la fuerza interior","Ciencia ficción","01h46min","En el año 2070, tras la caída de un meteorito, una raza de extraterrestres llega a la Tierra dispuesta a expulsar a la raza humana. Ya quedan muy pocos hombres en el planeta, y los pocos que hay se ven obligados a luchar cada día contra los extraños invasores que, con una...","http://es.web.img2.acsta.net/medias/nmedia/18/79/68/17/19513465.jpg"))
        dataSource.add(Movie("The Father","Drama","01h27min","Vassil está superando la pérdida de su mujer, cuando durante el entierro su vecina se acerca a decirle que su mujer estuvo intentando llamarla antes de su muerte. Vassil, un entusiasta de lo sobrenatural, decide ir en la búsqueda de un famoso médium. Su hijo Pavel, del que se encuentra distanciado, decide acompañarle para asegurarse que no le pase nada a él también.","http://es.web.img3.acsta.net/pictures/20/07/07/14/50/3107181.jpg"))
        dataSource.add(Movie("El Señor de los Anillos: La Comunidad del Anillo","Fantasia","02h58min","La trilogía del Señor de los Anillos se estrenó en 2001 con La Comunidad del Anillo, le siguió Las dos torres en 2002 y acabó con El retorno del Rey en 2003.En este episodio de la trilogía, el joven y tímido hobbit, Frodo Bolsón, hereda un anillo. Lejos de ser una simple baratija, se trata del Anillo...","http://es.web.img1.acsta.net/medias/nmedia/18/89/67/45/20061512.jpg"))
        dataSource.add(Movie("El juego de Ripley","Suspense","01h50min","Veinte años después de su debut en el mundo del crimen, Tom Ripley, ahora un vendedor de obras de arte, lleva una vida apacible en una majestuosa mansión. Pronto conoce a Jonathan, un hombre honrado al que persuade para cometer un asesinato a cambio de una gran suma de dinero. No tardará en perder el...","http://es.web.img3.acsta.net/medias/nmedia/18/89/99/37/20076274.jpg"))
        dataSource.add(Movie("Yalda, la noche del perdón","Drama","01h29min","Maryam es una mujer \"temporalmente casada\" con Naser, un hombre de 65 años al que no debería quedarle mucho de vida. De forma accidental, Maryam se encarga de que el tiempo que le quede sea nulo cuando le mata sin querer. A pesar de estar embarazada y que el hijo sea de Naser, la joven sabe que la única forma de que sea absuelta es con el perdón de la familia.","http://es.web.img1.acsta.net/pictures/21/03/11/11/03/0348566.jpg"))
        dataSource.add(Movie("Invasores de Marte","Ciencia ficción","01h35min","En esta nueva versión del clásico de ciencia-ficción dirigido por William Cameron Menzies en 1953, un niño llamado David Gardner trata de detener la invasión de la Tierra que están llevando a cabo unos extraterrestres que se apoderan de las mentes de los seres...","http://es.web.img1.acsta.net/pictures/210/044/21004433_2013050823092922.jpg"))
        dataSource.add(Movie("Brazil","Ciencia ficción","02h12min","En un Estado muy estructurado y burocrático, el Gobierno ha establecido medidas extremas y altamente contraproducentes para localizar terroristas. Un fallo dentro del sistema mezcla el apellido de un terrorista (Tuttle) y un hombre inocente (irónicamente llamado Buttle). Así, el hombre equivocado es...","http://es.web.img1.acsta.net/medias/nmedia/18/72/15/47/20531943.jpg"))
        dataSource.add(Movie("La Dolce Vita","Comedia dramática","02h54min","La Dolce Vita' es una película que relata las peripecias de Marcello Rubini, un paparazzi que va en busca de la foto del año. Para encontrarla, va de fiesta en fiesta, codeándose con la burguesía de la época. Cuando se entera de que una gran diva del cine llamada Sylvia aterriza en Roma, Marcello ve...","http://es.web.img3.acsta.net/pictures/210/076/21007637_20130522174656517.jpg"))
    }

    override fun getMovies(): List<Movie> {
        return dataSource
    }
}