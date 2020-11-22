class NotImplementedFraction(override val numerator: Int, override val denominator: Int) : IFraction {
    override operator fun plus(other: IFraction): IFraction {
        throw UnsupportedOperationException()
    }

    override operator fun minus(other: IFraction): IFraction {
        throw UnsupportedOperationException()
    }

    override operator fun times(other: IFraction): IFraction {
        throw UnsupportedOperationException()
    }

    override fun dividedBy(other: IFraction): IFraction {
        throw UnsupportedOperationException()
    }
}
