package id.order.kosan

class Data {
    var id = 0
    @JvmField
    var images = 0
    @JvmField
    var totalLike = 0
    @JvmField
    var harga: String? = null
    @JvmField
    var alamat: String? = null
    @JvmField
    var title: String? = null

    constructor()
    constructor(id: Int, images: Int, totalLike: Int) {
        this.id = id
        this.images = images
        this.totalLike = totalLike
    }

    constructor(id: Int, images: Int, title: String?, harga: String?, alamat: String?) {
        this.id = id
        this.images = images
        this.title = title
        this.harga = harga
        this.alamat = alamat
    }
}