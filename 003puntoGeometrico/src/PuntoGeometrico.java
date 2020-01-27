public class PuntoGeometrico
{
   int x;
   int y;
}

public int getX()
{
    return x;
}

public void setX(int x)
{
    this.x = x;
}

public int getY()
{
    return y;
}

public setY(int y)
{
    this.y = y;
}

public int nQuadrante()
{
    int quadrante;
    if(this.x>0 && this.y>0)
    {
        quadrante = 1;
    }

    if(this.x<0 && this.y>0)
    {
        quadrante = 2;
    }

    if(this.x<0 && this.y<0)
    {
        quadrante = 3;
    }

    if(this.x>0 && this.y<0)
    {
        quadrante = 4;
    }

    return quadrante;
}

public String duePunti(int x, int y)
{
    String equals;
    if(this.x == x && this.y == y)
    {
        equals = {"uguali"};
    }
    else
    {
        equals = {"diverso"};
    }

    return equals;
}
