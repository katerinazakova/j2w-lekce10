[#ftl]

[@c.page title="Student ${student.jmeno} ${student.prijmeni}"]
    <h1>Student ${student.jmeno} ${student.prijmeni}</h1>
    <p>třída: ${student.trida}</p>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Jméno</th>
            <th scope="col">Příjmení</th>
            <th scope="col">Telefon</th>
            <th scope="col">Email</th>

            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        [#list rodice as rodic]
            <tr>
                <td>${rodic.jmeno}</td>
                <td>${rodic.prijmeni}</td>
                <td>${rodic.telefon}</td>
                <td>${rodic.email}</td>

                <td><a href="/student/${student.id}">Detail</a></td>
            </tr>
        [/#list]
        </tbody>
    </table>
[/@c.page]
