[#ftl]

[@c.page title="Třída ${trida.nazev}"]
    <h1>Třída ${trida.nazev}</h1>
    <p>třídní učitel: ${trida.tridniUcitel.celeJmeno}</p>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Jméno</th>
            <th scope="col">Příjmení</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        [#list studenti as student]
            <tr>
                <td>${student.jmeno}</td>
                <td>${student.prijmeni}</td>
                <td><a href="/student/${student.id}">Detail</a></td>
            </tr>
        [/#list]
        </tbody>
    </table>
[/@c.page]
