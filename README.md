# Glow Ores

Glow Ores is a lightweight Fabric mod that makes ores illuminate their
surroundings with real Minecraft block light. It helps ores stand out in dark
caves without turning every ore vein into a bright lamp.

Diamond ores emit light at level 6. Other supported ores emit light at level 4,
while coal and deepslate coal remain dark.

## Features

- Real block light that affects nearby blocks and the surrounding environment
- Light level 6 for diamond ores
- Light level 4 for other supported ores
- No light from coal or deepslate coal
- Support for overworld, deepslate, and Nether ores
- Automatic support for compatible modded ores through standard block tags
- Support for all 39 non-coal ore variants from Universal Ores
- Works without shaders and has no shaderpack dependency
- Suitable for single-player worlds and multiplayer servers

## Supported ores

Glow Ores supports vanilla variants of:

- Copper
- Iron
- Gold and Nether gold
- Redstone
- Lapis lazuli
- Diamond
- Emerald
- Nether quartz
- Ancient debris

Modded ores can be included automatically when they use Minecraft's standard
ore tags. Modpack authors can also extend the Glow Ores block tags with a data
pack. Coal is intentionally excluded.

## Shader compatibility

Glow Ores uses Minecraft's standard block-light system instead of depending on
a particular shaderpack. Shaders are optional, and shaderpacks that respect
Minecraft or Iris block emission can detect the light automatically.

Verified on Minecraft 1.21.11 with Iris:

- Complementary Reimagined r5.8.1
- BSL 10.1.3
- MakeUp Ultra Fast 9.5d

Some advanced shaderpacks replace Minecraft's lighting with their own voxel or
path-traced lighting system. Those packs may require a dedicated compatibility
profile before they recognize ores as light sources.

## Future plans

Minecraft's standard block light stores brightness, not separate red, green,
and blue values. Colored ore lighting therefore depends on support for each
shaderpack's own lighting system.

Future releases are planned to add optional, individually tested colored-light
compatibility for selected shaderpacks. The first planned profile is Eclipse,
with colors matched to each ore, such as cyan diamond light, blue lapis light,
and red redstone light. Glow Ores will continue to work independently when no
supported shaderpack is installed.

## Compatibility

- Minecraft 1.21.11
- Fabric Loader 0.18.1 or newer
- Fabric API
- Java 21

## License

Glow Ores is available under the CC0 1.0 license.
