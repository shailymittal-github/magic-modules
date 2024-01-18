package vcs_roots

import ProviderNameBeta
import ProviderNameGa
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HashiCorpVCSRootGa: GitVcsRoot({
    name = "https://github.com/hashicorp/terraform-provider-${ProviderNameGa}#refs/heads/main"
    url = "https://github.com/hashicorp/terraform-provider-${ProviderNameGa}"
    branch = "refs/heads/main"
    branchSpec = """
        +:*
        -:refs/pull/*/head
    """.trimIndent()
})

object HashiCorpVCSRootBeta: GitVcsRoot({
    name = "https://github.com/hashicorp/terraform-provider-${ProviderNameBeta}#refs/heads/main"
    url = "https://github.com/hashicorp/terraform-provider-${ProviderNameBeta}"
    branch = "refs/heads/main"
    branchSpec = """
        +:*
        -:refs/pull/*/head
    """.trimIndent()
})

object ModularMagicianVCSRootGa: GitVcsRoot({
    name = "https://github.com/modular-magician/terraform-provider-${ProviderNameGa}#refs/heads/main"
    url = "https://github.com/modular-magician/terraform-provider-${ProviderNameGa}"
    branch = "refs/heads/main"
    branchSpec = """
        +:*
        -:refs/pull/*/head
    """.trimIndent()
})

object ModularMagicianVCSRootBeta: GitVcsRoot({
    name = "https://github.com/modular-magician/terraform-provider-${ProviderNameBeta}#refs/heads/main"
    url = "https://github.com/modular-magician/terraform-provider-${ProviderNameBeta}"
    branch = "refs/heads/main"
    branchSpec = """
        +:*
        -:refs/pull/*/head
    """.trimIndent()
})
