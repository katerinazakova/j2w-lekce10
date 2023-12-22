[#ftl]

[@c.page title="Rodič ${rodic.jmeno} ${rodic.prijmeni}"]
    <h1>Rodič ${rodic.jmeno} ${rodic.prijmeni}</h1>
    <h4>Děti:</h4>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">Jméno</th>
            <th scope="col">Příjmení</th>
            <th scope="col">Třída</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        [#list deti as dite]
            <tr>
                <td>${dite.jmeno}</td>
                <td>${dite.prijmeni}</td>
                <td>${dite.trida}</td>
                <td><a href="/trida/${dite.trida.id}">Detail</a></td>
            </tr>
        [/#list]
        </tbody>
    </table>
    [@c.back/]

[/@c.page]
