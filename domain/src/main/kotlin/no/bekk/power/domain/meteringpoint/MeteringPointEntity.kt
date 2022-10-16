package no.bekk.power.domain.meteringpoint

import no.bekk.power.domain.valuetypes.Address
import no.bekk.power.domain.valuetypes.MeteringPointId
import no.bekk.power.domain.valuetypes.MeteringPointName
import no.bekk.power.domain.valuetypes.PowerZone

class MeteringPointEntity(
    internal val meteringPointId: MeteringPointId,
    val name: MeteringPointName,
    val address: Address,
    val powerZone: PowerZone
) {

    val id: MeteringPointId
        get() = meteringPointId
}
