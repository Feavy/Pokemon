package fr.feavy.pokemon.drawable.character.movement;

import fr.feavy.pokemon.location.Location;

public interface MovingBehavior {
    Location move(Location from);
}
