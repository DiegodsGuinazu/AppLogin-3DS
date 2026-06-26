package br.sp.etec.sebrae.api_login.repository

import br.sp.etec.sebrae.api_login.entity.Boleto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.RestController


@Repository

interface BoletoRepository : JpaRepository<Boleto, Long> {
}