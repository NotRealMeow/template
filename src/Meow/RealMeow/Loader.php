<?php

namespace Meow\RealMeow;

use pocketmine\plugin\PluginBase;
use pocketmine\player\Player;
use pocoetmine\Server;

use pocketmine\utils\Config;
use pocketmine\utils\TextFormat as TheF;


class Loader extends PluginBase {

 public static Loader $instance;

 public function onEnable(): void {
   $this->getServer()->getPluginManager()->registerEvents(new EventHandler($this), $this);
   self::$instance = $this;
 }

 public static function getInstance(): Loader {
   return self::$instance;
 }
  
}
