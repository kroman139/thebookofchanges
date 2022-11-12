/*
 * Copyright 2022 kroman139
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package local.kroman139.thebookofchanges.model.data

data class HexagramStroke(
    val solidLine: Boolean,
    val text: String,
    val summary: String,
)

data class Hexagram(
    val id: String,
    val symbol: String,
    val logogram: String,
    val title: String,
    val text: String,
    val summary: String,
    val strokes: List<HexagramStroke>,
    val symbolStrokes: List<Boolean>,
)

val previewHexagrams = listOf(
    Hexagram(
        id = "1",
        symbol = "䷀",
        logogram = "乾",
        title = "«Цянь», Творчество",
        text = "Здесь творчество рассматривается в его самом чистом виде. Это прежде всего — акциденция неба как олицетворения творческой силы, которая лежит в начале всего существующего. Она, как универсальная сила, принципиально не может иметь никаких препятствий в своём развитии, которому благоприятствует то, что эта сила является совершенно стойкой. Совершенный человек может в своей деятельности полностью проявить такое творчество, которое благотворно отражается на всём его окружении. Вот почему в тексте сказано:",
        summary = "Творчество. В изначальном развитии благоприятствует стойкость.",
        strokes = listOf(
            HexagramStroke(
                solidLine = true,
                text = "Вообще активной деятельности отдаётся предпочтение перед простым, пассивным бытиём. Поэтому нужна особая бдительность для того, чтобы эта деятельность привела к положительному результату. Момент её начала является одним из самых ответственных моментов. В нём ещё неуместна деятельность, а нужна лишь замкнутая и сосредоточенная подготовка. Человек может быть полон сил, но время ещё неблагоприятно для его деятельности. В образе нырнувшего дракона, т. е. мощного существа, которое скрылось и ещё не действует, изображается такой человек. Не следует думать, что это может относиться лишь к каким-нибудь особенным людям, ибо совершенно не в духе Книги ограничивать предостережения, даваемые в ней, их пригодностью лишь для некоторых людей. Поэтому о первом моменте всякого творчества сказано:",
                summary = "В начале сильная черта. Нырнувший дракон, не действуй.",
            ),
            HexagramStroke(
                solidLine = true,
                text = "Следующий момент, выраженный второй чертой, которая в символике называется полем, т. е. поверхностью земли, характеризуется тем, что человек, полный творческой силы, зашифрованный в образе дракона, может уже выйти из своего уединения: он, появившийся, уже находится в поле. Его творчество уже может проявиться, он видим всеми, и это положение для всех благоприятствует встрече с таким великим человеком. Кроме того, в системе графических соотношений символов Книг принято считать, что между чертами символов существует некий резонанс, «соответствие», а именно: первая черта соответствует четвертой, вторая — пятой, третья — шестой. Но в символике социальной иерархии пятая черта обозначает государя. Поэтому на второй позиции, стоящей в соответствии с пятой, благоприятна встреча с великим человеком. Вот почему текст этой черты гласит:",
                summary = "Сильная черта на втором месте. Появившийся дракон находится на поле. Благоприятна встреча с великим человеком.",
            ),
            HexagramStroke(
                solidLine = true,
                text = "Первая волна творческого акта на второй позиции уже достигла высшей точки. Но всё это существует пока лишь внутренне, ибо первые три черты обозначают внутренний мир, а вторые три — внешний. Всё это ещё не реализовано вовне . Необходим выход из себя для этой реализации. Он символизирован третьей чертой. При таком переходе естественно возникает некий кризис, делающий это положение опасным даже для благородного человека, который на протяжении всего первого периода творчества — «весь день» — отдавался непрерывному созиданию. Только полная сил бдительность в конце этого периода — «вечером» — может привести к тому, что хулы не будет. Так об этом сказано и в тексте:",
                summary = "Сильная черта на третьем месте. Благородный человек до конца дня непрерывно созидает. Вечером он бдителен. Опасность. Но хулы не будет.",
            ),
            HexagramStroke(
                solidLine = true,
                text = "При выходе к активной деятельности вовне у человека, подготовившего её внутренне, точно вырывается почва из-под ног, но именно эта предваительная подготовленность делает возможным благоприятный исход. Это с достаточной ясностью выражено в образе текста:",
                summary = "Сильная черта на четвертом месте. Точно прыжок в бездне. Хулы не будет.",
            ),
            HexagramStroke(
                solidLine = true,
                text = "Только на пятой позиции творческий процесс выступает в своей полной силе. Он до конца проявился вовне и, имея в себе достаточную мощь, не нуждается ни в какой поддержке. Он, как полный сил дракон, летит в небе. С такой высоты творящий легко может заметить великого человека, где бы тот ни находился. Но и сам он является великим человеком, настолько развернувшим свою деятельность, что его нетрудно увидеть кому угодно. Вот как это выражено в тексте:",
                summary = "Сильная черта на пятом месте. Летящий дракон находится в небе. Благоприятна встреча с великим человеком.",
            ),
            HexagramStroke(
                solidLine = true,
                text = "На этом, собственно, заканчивается творческий процесс. Всё дальнейшее является лишь ненужным переразвитием. Раз творчество уже достигло своего полнейшего проявления и больше уже ничего создать нельзя, то тот, кто в этом положении всё же захотел бы «творить» ещё дальше, проявил бы лишь свою излишнюю гордость, в результате которой ему пришлось бы раскаяться. Так об этом говорит и данный текст: Наверху сильная черта. Возгордившийся дракон. Будет раскаяние. Резюме Весь процесс творчества выражен сильными световыми чертами. Это, конечно, благотворные силы, но для подлинно благого результата необходимо вполне управлять ими и не допускать того, чтобы они главенствовали. Только тогда деятельность может идти в гармоническом отношении ко всему мировому свершению и быть счастливой. Поэтому в тексте, где силы света выражены в образе драконов, сказано:",
                summary = "При действии сильных черт смотри, чтобы все драконы не главенствовали. Тогда будет счастье.",
            )
        ),
        symbolStrokes = listOf(true, true, true, true, true, true)
    ),
    Hexagram(
        id = "34",
        symbol = "䷡",
        logogram = "大壯",
        title = "«Да-чжуань», Мощь великого",
        text = "За время предыдущего периода человек может выработать все силы, которые нужны ему для дальнейшей деятельности. Весь смысл этой временной задержки в деятельности, которая была намечена в предыдущем, состоит именно в том, чтобы в спокойствии выработать, возможно, большую силу, необходимую для какого-нибудь крупного дела, которое может быть осуществлено в дальнейшем. Во время этого спокойствия вырабатывается великая мощь, которая является темой данной ситуации, но при этом всегда надо иметь в виду, что великая мощь может быть только тогда, когда человек не полагается исключительно на одного себя, а действует совместно с коллективом. В этом отношении нужно с полной стойкостью соблюдать свои связи с окружающими людьми. Поэтому весьма краткий текст говорит:",
        summary = "Мощь великого. Благоприятна стойкость.",
        strokes = listOf(
            HexagramStroke(
                solidLine = true,
                text = "В общем мы уже указали на стойкость. Здесь для дальнейшего рассмотрения нужно принять во внимание, что стойкость (чжэн) интерпретируется постоянно и как правота. И именно с этим значением правоты, верности приходится считаться. Для понимания образа данной черты необходимо вспомнить то, что говорилось в 32-й гексаграмме относительно символики тела в «Книге Перемен». В первый момент проявления великой мощи, о которой говорит данная ситуация, прежде всего, необходимо принять во внимание, что стойкость (она же — правота) должна быть понята как объективная правота, как та, которая подтверждена всем окружением человека. Ибо если бы, наоборот, человек рассчитывал на стойкость как на свое собственное качество, он впал бы в ошибку так же, как впал бы в ошибку, если бы успокоил себя тем, что мощь его велика. Поэтому всякое выступление к деятельности здесь еще не может быть благоприятным, ибо на данной ступени, ступени первого момента ситуации мощи великого, нужно только собрать силы к развитию данной ситуации по дальнейшим этапам. Поэтому текст «Книги Перемен» говорит здесь:",
                summary = "В начале сильная черта. Мощь в пальцах ног. Поход — к несчастью. Так будет подлинно!",
            ),
            HexagramStroke(
                solidLine = true,
                text = "Стойкость, понимаемая как правота, является в данной ситуации подлинным внутренним качеством занимающего ее лица. Именно на второй позиции мы всегда встречаем максимальное выражение внутренних качеств. Поэтому лаконичный текст здесь только напоминает:",
                summary = "Сильная черта на втором месте. Стойкость — к счастью.",
            ),
            HexagramStroke(
                solidLine = true,
                text = "Третья позиция, как позиция кризиса, характеризуется тем, что за деятельность человек берется, не обладая достаточным количеством сил. Хотя здесь в ситуации мощи великого предполагается наличие больших сил, однако подлинно большие силы у человека могут быть лишь в том случае, если он опирается на окружение, т.е. если он в этическом плане связан с другими людьми и с их деятельностью. Поскольку третья черта представляет собой замыкание в себе как противоположность выхода вовне, постольку не сможет здесь человек рассчитывать на поддержку окружающих его людей. Если бы он все же стал действовать вопреки нормальной ситуации, то он проявил бы себя как человек, лишенный этических качеств, т.е. неблагородный человек. И все же, если бы такой человек стал действовать, то настойчивость его в этом действии была бы ужасной. И это «Книга Перемен» выражает в образе, полном юмора:",
                summary = "Сильная черта на третьем месте. Ничтожному человеку придется быть мощным. Благородному человеку придется погибнуть. Стойкость — ужасна. Когда козел бодает изгородь, то в ней застрянут его рога.",
            ),
            HexagramStroke(
                solidLine = true,
                text = "Для того чтобы понять афоризм данной черты, необходимо вспомнить, из чего состоит данная гексаграмма. В ней внизу «творчество», т.е. творческие силы, которыми полна внутренняя жизнь человека: вовне триграмма «молния», т.е. активнейшая деятельность. Само по себе творчество, поскольку оно только внутри, может быть понято как творчество в потенциальном состоянии. Верхняя же триграмма действия характеризует уже проявления этой творческой мощи вовне. Поэтому нижняя черта верхней триграммы, т.е. первый выход вовне, обусловлена самой ситуацией, выраженной здесь в образе пробитой изгороди, которую можно понять, лишь сопоставив ее с образом предыдущего афоризма. Здесь имеется в виду выход к деятельности большого размаха. Такая деятельность может охватить большие пространства. Поэтому здесь появляется образ колесницы как средства передвижения. И в этом стремлении к действию вовне должна быть соблюдена полная стойкость, которая в данном контексте понимается и как правота этого действия. В тексте мы здесь читаем:",
                summary = "Сильная черта на четвертом месте. Изгородь пробита. В ней не застрянешь. Мощь — в осях большой колесницы. Стойкость — к счастью. Раскаяние исчезнет.",
            ),
            HexagramStroke(
                solidLine = false,
                text = "На третьей позиции встретился образ козла, бодающего изгородь. Этот козел — символ необузданной силы, которая бросается к внешней деятельности, не соразмерившись с препятствием. Поскольку пятая позиция представляет собою самое гармоничное проявление вовне качеств, символизируемые этим козлом, должны быть здесь отражены. Более того, они должны отойти от человека настолько и быть заменены своей противоположностью, что должно наступить исправление совершенных прежде ошибок. Вот почему текст говорит здесь:",
                summary = "Слабая черта на пятом месте. Утратишь козла даже в легких обстоятельствах. Раскаяния не будет.",
            ),
            HexagramStroke(
                solidLine = false,
                text = "Параллельно с мощью, о которой говорилось в данной гексаграмме, в ней говорилось о стремлении проявить эту мощь. В момент переразвития, который символизируется верхней чертой, положительное качество, т.е. мощность, отступает на задний план, и необдуманный поступок, и стремление к проявлению вовне без достаточных сил выступают как характеристика данного момента. Но если на третьей позиции, которая представляет собою лишь переход к внешней деятельности, это уже приводило к неблагоприятным результатам, то здесь это качество может привести к совершенно безвыходному положению. Здесь нельзя ожидать ничего благоприятного. Но если человек в этих самых неблагоприятных условиях будет ими спровоцирован на напряжение своих сил, а тем самым и на развитие их, то, в конце концов, он может найти благоприятный выход из создавшегося положения. Эта мысль выражена в тексте следующих образах:",
                summary = "Наверху слабая черта. Козел бодает изгородь и не может отступить, не может и продвинуться. Ничего благоприятного. Но если будет трудно то будет счастье.",
            )
        ),
        symbolStrokes = listOf(true, true, true, true, false, false)
    ),
)