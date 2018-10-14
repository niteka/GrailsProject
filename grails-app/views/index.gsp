<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>

<body>
<content tag="nav">

    <li class="controller">
        <a href="${createLink(action: 'index')}" role="button">Accueil</a>
    </li>

    <li class="controller">
        <a href="${createLink(action: 'index', controller: 'user')}" role="button">Users</a>
    </li>


    <li class="controller">
        <a href="${createLink(action: 'index', controller: 'match')}" role="button">Match</a>
    </li>


    <li class="controller">
        <a href="${createLink(action: 'index', controller: 'message')}" role="button">Message</a>
    </li>


</content>

<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <asset:image src="logo_mbds.png" class="grails-logo"/>
    </div>
</div>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>MBDS Grails Project</h1>

        <p>
            MBDS project grails 2018
        </p>
    </section>
</div>

</body>
</html>
