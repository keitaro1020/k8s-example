<template>
  <b-navbar toggleable="md" type="dark" variant="primary">

    <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

    <b-navbar-brand router-link to="/">
        <img src="../assets/kubernetes-logo.svg" alt="BV" style="height:30px; width:30px;">
        k8s example
    </b-navbar-brand>

    <b-collapse is-nav id="nav_collapse">

      <b-navbar-nav>
        <b-nav-item router-link to="/book">book</b-nav-item>
      </b-navbar-nav>

    </b-collapse>
  </b-navbar>

</template>

<script>
</script>
