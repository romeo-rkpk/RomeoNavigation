package org.lumenk.romeonavigation.objects.roads;

import org.jetbrains.annotations.NotNull;
import org.lumenk.romeonavigation.objects.waypoints.OnRoadWaypoint;
import org.lumenk.romeonavigation.objects.waypoints.Waypoint;

/**
 * 일정한 거리를 가지는 도로에 대한 객체입니다.
 * @param <WaypointIdType> 노드의 id타입을 지정하십시오.
 * @param <RoadIdType> 경로의 id타입을 지정하십시오.
 */
public class FixedDistanceRoad<WaypointIdType, RoadIdType>
        extends Road<OnRoadWaypoint<WaypointIdType, RoadIdType>, WaypointIdType, RoadIdType>{

    private final Double distance;
    public FixedDistanceRoad(OnRoadWaypoint<WaypointIdType, RoadIdType> from, OnRoadWaypoint<WaypointIdType, RoadIdType> to, RoadIdType id, @NotNull Double distance) {
        super(from, to, id);
        this.distance = distance;
    }

    @NotNull
    public Double getDistance() {
        return distance;
    }
}