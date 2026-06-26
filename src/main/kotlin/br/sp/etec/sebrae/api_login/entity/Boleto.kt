package br.sp.etec.sebrae.api_login.entity

import jakarta.annotation.Generated
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity

class Boleto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id  : Long? = null
    var descricao: String? = null
    var valor: Double? = null
    var vencimento: Double? = null
}